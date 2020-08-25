package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.bean.Coupon;
import whj.nb.motianluneureka.service.CouponService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Coupon)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:10
 */
@RestController
@RequestMapping("coupon")
public class CouponController {
    /**
     * 服务对象
     */
    @Resource
    private CouponService couponService;

    /**
     * 优惠券列表
     * @param customerId
     * @return
     */
    @RequestMapping(value = "/{customerId}",method = RequestMethod.GET)
    public ResultVO list(@PathVariable("customerId") String customerId){
        try {
            List<Coupon> couponList = couponService.queryAllByLimit(customerId, 1, 5);
            return new ResultVO(0,"find couponList success",couponList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }

    }

    /**
     * 使用优惠券
     *
     * @return 单条数据
     */
    @RequestMapping(value = "use",method = RequestMethod.GET)
    public ResultVO use(String couponId) {
        try {
            Coupon coupon = couponService.queryById(couponId);
            return new ResultVO(0,"find coupon success",coupon.getCouponType());
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

}