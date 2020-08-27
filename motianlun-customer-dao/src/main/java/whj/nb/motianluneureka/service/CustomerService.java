package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.Customer;

import java.util.List;

/**
 * (Customer)表服务接口
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:13
 */
public interface CustomerService {

    /**
     * 登录
     * @param customerPhone 主键
     * @return 实例对象
     */
    Customer queryById(String customerPhone);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    boolean insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    boolean update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    boolean deleteById(String customerId);

}