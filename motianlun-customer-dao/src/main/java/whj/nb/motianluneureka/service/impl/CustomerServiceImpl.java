package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.CustomerDao;
import whj.nb.motianluneureka.bean.Customer;
import whj.nb.motianluneureka.service.CustomerService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Customer)表服务实现类
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:13
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    /**
     * 登录
     * @param customerPhone 主键
     * @return 实例对象
     */
    @Override
    public Customer queryById(String customerPhone) {
        return this.customerDao.queryById(customerPhone);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Customer> queryAllByLimit(int offset, int limit) {
        return this.customerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Customer customer) {

        return this.customerDao.insert(customer)>0;
    }

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Customer customer) {
        return this.customerDao.update(customer)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String customerId) {
        return this.customerDao.deleteById(customerId) > 0;
    }
}