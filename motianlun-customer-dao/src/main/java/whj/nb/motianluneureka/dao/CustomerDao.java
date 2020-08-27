package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Customer;

import java.util.List;

/**
 * (Customer)表数据库访问层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:11
 */
@Mapper
public interface CustomerDao {

    /**
     * 登录
     * @param customerPhone 主键
     * @return 实例对象
     */
    Customer queryById(String customerPhone);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customer 实例对象
     * @return 对象列表
     */
    List<Customer> queryAll(Customer customer);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    int insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    int update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 影响行数
     */
    int deleteById(String customerId);

}