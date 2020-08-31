package whj.nb.motianluneureka.pay;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import io.goeasy.GoEasy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.entity.Orders;
import whj.nb.motianluneureka.sdk.MyWXConfig;
import whj.nb.motianluneureka.sdk.WXPay;
import whj.nb.motianluneureka.service.OrdersService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;



@RestController
@CrossOrigin
@RequestMapping("pay")
public class PayController {

    @Resource
    private OrdersService ordersService;

    @RequestMapping("order/{orderId}")
    public ResultVO order(@PathVariable String orderId,  HttpSession session){
        ResultVO<Object> resultVO = new ResultVO<>();
        Orders orders = ordersService.queryById(orderId);
        if (orders.getState().equals("1")){
            resultVO.setCode(1);
            resultVO.setMsg("订单已超时过期");
            return resultVO;
        }
        try {
            WXPay wxPay = new WXPay(new MyWXConfig());
            Map<String, String> data = new HashMap<String, String>();
            data.put("body", "摩天轮票务");
            data.put("out_trade_no", orderId);
            data.put("device_info", "PC");
            data.put("fee_type", "CNY");
            data.put("total_fee", "1");
            data.put("spbill_create_ip", "123.12.12.123");
            data.put("notify_url", " http://469zsx.natappfree.cc/pay/notify");
            // 此处指定为扫码支付
            data.put("trade_type", "NATIVE");
            data.put("product_id", "12");

            try {
                Map<String, String> resp = wxPay.unifiedOrder(data);
                String code_url = resp.get("code_url");
                session.setAttribute("payUrl",code_url);
                resultVO.setCode(0);
                resultVO.setMsg("订单未过期，请扫码支付");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultVO;
    }

    @RequestMapping("/qrcode")
    public void qrcode(HttpServletResponse response,HttpSession session) throws URISyntaxException, IOException {
        //二维码需要包含的文本内容
        String uri = session.getAttribute("payUrl").toString();
        HashMap<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        //二维码精度高度
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        //边距
        hints.put(EncodeHintType.MARGIN, 0);
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(uri, BarcodeFormat.QR_CODE, 200, 200, hints);
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 接收微信支付结果通知的接口
     * @param response
     * @throws IOException
     */
    @RequestMapping("notify")
    public void notifyUrl( HttpServletResponse response) throws IOException {
        GoEasy goEasy = new GoEasy( "http://rest-hangzhou.goeasy.io", "BC-32c8c3d346714a21b3a25cc71e163225");
        goEasy.publish("weifenxiao", "支付成功");

        //给微信一个响应
        response.getWriter().println("<xml>\n" +
                "  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                "  <return_msg><![CDATA[OK]]></return_msg>\n" +
                "</xml>");


    }
}
