package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.bean.CustomerLove;

import java.util.List;

/**
 * (CustomerLove)表数据库访问层
 *
 * @author ChanzZ
 * @since 2020-08-25 14:06:47
 */
@Mapper
public interface CustomerLoveDao {

    /**
     * 通过ID查询单条数据
     *
     * @param customerLoveId 主键
     * @return 实例对象
     */
    CustomerLove queryById(String customerLoveId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CustomerLove> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customerLove 实例对象
     * @return 对象列表
     */
    List<CustomerLove> queryAll(CustomerLove customerLove);

    /**
     * 新增数据
     *
     * @param customerLove 实例对象
     * @return 影响行数
     */
    int insert(CustomerLove customerLove);

    /**
     * 修改数据
     *
     * @param customerLove 实例对象
     * @return 影响行数
     */
    int update(CustomerLove customerLove);

    /**
     * 通过主键删除数据
     *
     * @param customerLoveId 主键
     * @return 影响行数
     */
    int deleteById(String customerLoveId);

}