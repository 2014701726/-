package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.Goods;

import java.util.List;

/**
 * (Goods)表服务接口
 *
 * @author makejava
 * @since 2020-08-25 20:08:33
 */
public interface GoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param goodId 主键
     * @return 实例对象
     */
    Goods queryById(long goodId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Goods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    Goods insert(Goods goods);

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    Goods update(Goods goods);

    /**
     * 通过主键删除数据
     *
     * @param goodId 主键
     * @return 是否成功
     */
    boolean deleteById(String goodId);

}