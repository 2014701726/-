package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.CustomerLoveDao;
import whj.nb.motianluneureka.bean.CustomerLove;
import whj.nb.motianluneureka.service.CustomerLoveService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerLove)表服务实现类
 *
 * @author ChanzZ
 * @since 2020-08-25 14:06:49
 */
@Service("customerLoveService")
public class CustomerLoveServiceImpl implements CustomerLoveService {
    @Resource
    private CustomerLoveDao customerLoveDao;

    /**
     * 通过ID查询单条数据
     *
     * @param customerLoveId 主键
     * @return 实例对象
     */
    @Override
    public CustomerLove queryById(String customerLoveId) {
        return this.customerLoveDao.queryById(customerLoveId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CustomerLove> queryAllByLimit(int offset, int limit) {
        return this.customerLoveDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customerLove 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerLove insert(CustomerLove customerLove) {
        this.customerLoveDao.insert(customerLove);
        return customerLove;
    }

    /**
     * 修改数据
     *
     * @param customerLove 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerLove update(CustomerLove customerLove) {
        this.customerLoveDao.update(customerLove);
        return this.queryById(customerLove.getCustomerLoveId());
    }

    /**
     * 通过主键删除数据
     *
     * @param customerLoveId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String customerLoveId) {
        return this.customerLoveDao.deleteById(customerLoveId) > 0;
    }
}