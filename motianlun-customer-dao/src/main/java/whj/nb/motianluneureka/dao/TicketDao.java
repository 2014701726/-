package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Ticket;

import java.util.List;

/**
 * (Ticket)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 12:02:59
 */
@Mapper
public interface TicketDao {

    /**
     * 通过ID查询单条数据
     *
     * @param checkTickedId 主键
     * @return 实例对象
     */
    Ticket queryById(String checkTickedId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Ticket> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ticket 实例对象
     * @return 对象列表
     */
    List<Ticket> queryAll(Ticket ticket);

    /**
     * 新增数据
     *
     * @param ticket 实例对象
     * @return 影响行数
     */
    int insert(Ticket ticket);

    /**
     * 修改数据
     *
     * @param ticket 实例对象
     * @return 影响行数
     */
    int update(Ticket ticket);

    /**
     * 通过主键删除数据
     *
     * @param checkTickedId 主键
     * @return 影响行数
     */
    int deleteById(String checkTickedId);

}