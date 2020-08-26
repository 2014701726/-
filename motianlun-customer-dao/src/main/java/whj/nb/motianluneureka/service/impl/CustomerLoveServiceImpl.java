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

    @Override
    public List<CustomerLove> queryAll(String customerId) {
        return this.customerLoveDao.queryAll(customerId);
    }


    /**
     * 新增数据
     *
     * @param customerLove 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(CustomerLove customerLove) {
        return this.customerLoveDao.insert(customerLove)>0;
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