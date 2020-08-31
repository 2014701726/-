package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.CustomerLove;

import java.util.List;

/**
 * (CustomerLove)表服务接口
 *
 * @author ChanzZ
 * @since 2020-08-25 14:06:48
 */
public interface CustomerLoveService {

    /**
     * 通过ID查询单条数据
     *
     * @param customerLoveId 主键
     * @return 实例对象
     */
    CustomerLove queryById(String customerLoveId);

    /**
     * 查询想看列表
     * @param customerId
     * @return
     */
    List<CustomerLove> queryAll(String customerId);

    /**
     * 新增数据
     *
     * @param customerLove 实例对象
     * @return 实例对象
     */
    boolean insert(CustomerLove customerLove);



    /**
     * 通过主键删除数据
     *
     * @param customerLoveId 主键
     * @return 是否成功
     */
    boolean deleteById(String customerLoveId);

}