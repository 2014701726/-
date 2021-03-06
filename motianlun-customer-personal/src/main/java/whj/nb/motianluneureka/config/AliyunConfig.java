package whj.nb.motianluneureka.config;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendBatchSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class AliyunConfig {

    public static final String product="Dysmsapi";
    /**
     * 产品域名
     */
    public static final String domain="dysmsapi.aliyuncs.com";

    public static final String accessKeyId="LTAI4GEcWrxAvGYdzzmBAv9p";

    public static  final String accessKeySecret="btwik0T1vhstkDBNtSxqkKZwdHZEh3";

    /**
     * 以下为测试代码，随机生成验证码
     */
    private static int newcode;

    public static int getNewcode() {
        return newcode;
    }
    public static void setNewcode(){
        //每次调用生成一位四位数的随机数
        newcode = (int)((Math.random()*9+1)*100000);
    }

    public static SendSmsResponse sendSms(String telnum,String code,String templateCode)
    {
        //设置过期时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "300000");
        System.setProperty("sun.net.client.defaultReadTimeout", "300000");
        try {
            //初始化acsClient
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);
            SendSmsRequest request = new SendSmsRequest();
            request.setPhoneNumbers(telnum);
            //短信签名
            request.setSignName("摩天轮");
            //短信模板
            request.setTemplateCode(templateCode);
            //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
            request.setTemplateParam("{\"code\":\"" + code + "\"}");
            //hint 此处可能会抛出异常，注意catch
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
            if(sendSmsResponse.getCode()!= null && sendSmsResponse.getCode().equals("OK")){
                System.out.println("短信发送成功！");
            }else {
                System.out.println("短信发送失败！");
            }
            return sendSmsResponse;
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String login(String telnum)throws ClientException, InterruptedException{
        setNewcode();
        String code = Integer.toString(getNewcode());
        //发短信
        SendSmsResponse response = sendSms(telnum, code,"SMS_200710208");
        return code;
    }

    public String register(String telnum)throws ClientException, InterruptedException{
        setNewcode();
        String code = Integer.toString(getNewcode());
        //发短信
        SendSmsResponse response = sendSms(telnum, code,"SMS_200690165");
        return code;
    }

    public void order(String takerPhone,String takerName,String orderId,String time,String ticket,Integer ticketNum,String seat,Double price)throws ClientException, InterruptedException {
        {
            //设置过期时间
            System.setProperty("sun.net.client.defaultConnectTimeout", "300000");
            System.setProperty("sun.net.client.defaultReadTimeout", "300000");
            try {
                //初始化acsClient
                IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
                DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
                IAcsClient acsClient = new DefaultAcsClient(profile);
                SendSmsRequest request = new SendSmsRequest();
                request.setPhoneNumbers(takerPhone);
                //短信签名
                request.setSignName("摩天轮");
                //短信模板
                request.setTemplateCode("SMS_200724097");
                //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为

                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("{\"name\":\"" + takerName + "\",");
                stringBuffer.append("\"orderId\":\"" + orderId + "\",");
                stringBuffer.append("\"time\":\"" + time + "\",");
                stringBuffer.append("\"ticket\":\"" + ticket + "\",");
                stringBuffer.append("\"ticketNum\":\"" + ticketNum + "\",");
                stringBuffer.append("\"seat\":\"" + seat + "\",");
                stringBuffer.append("\"price\":\"" + price + "\"}");

                request.setTemplateParam(stringBuffer.toString());
                //orderId-其他；time-演出时间；ticket-演出名称；ticketNum-票数；seat-其他；price-其他；
                //hint 此处可能会抛出异常，注意catch
                SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
                if (sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                    System.out.println("短信发送成功！");
                } else {
                    System.out.println("短信发送失败！");
                }
            } catch (ClientException e) {
                e.printStackTrace();
            }


        }


    }
}


