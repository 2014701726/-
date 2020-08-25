package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.bean.Coupon;

import java.util.List;

/**
 * (Coupon)表服务接口
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:09
 */
public interface CouponService {

    /**
     * 通过ID查询单条数据
     *
     * @param couponId 主键
     * @return 实例对象
     */
    Coupon queryById(String couponId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Coupon> queryAllByLimit(String customerId,int offset, int limit);



}