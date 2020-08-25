package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.bean.CustomerLove;

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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CustomerLove> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customerLove 实例对象
     * @return 实例对象
     */
    CustomerLove insert(CustomerLove customerLove);

    /**
     * 修改数据
     *
     * @param customerLove 实例对象
     * @return 实例对象
     */
    CustomerLove update(CustomerLove customerLove);

    /**
     * 通过主键删除数据
     *
     * @param customerLoveId 主键
     * @return 是否成功
     */
    boolean deleteById(String customerLoveId);

}