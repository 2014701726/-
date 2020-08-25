package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.CouponDao;
import whj.nb.motianluneureka.bean.Coupon;
import whj.nb.motianluneureka.service.CouponService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Coupon)表服务实现类
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:09
 */
@Service("couponService")
public class CouponServiceImpl implements CouponService {
    @Resource
    private CouponDao couponDao;

    /**
     * 通过ID查询单条数据
     *
     * @param couponId 主键
     * @return 实例对象
     */
    @Override
    public Coupon queryById(String couponId) {
        return this.couponDao.queryById(couponId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Coupon> queryAllByLimit(String customerId,int offset, int limit) {
        return this.couponDao.queryAllByLimit(customerId,offset, limit);
    }

}