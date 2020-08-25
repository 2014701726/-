package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.bean.Coupon;

import java.util.List;

/**
 * (Coupon)表数据库访问层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:08
 */
@Mapper
public interface CouponDao {

    /**
     * 通过ID查询单条数据
     *
     * @param couponId 主键
     * @return 实例对象
     */
    Coupon queryById(String couponId);

    /**
     * 查询指定行数据
     * @param customerId
     * @param offset
     * @param limit
     * @return
     */
    List<Coupon> queryAllByLimit(@Param("customerId")String customerId,@Param("offset") int offset, @Param("limit") int limit);



}