package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Ticket;

import java.util.List;

/**
 * (Ticket)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 10:37:01
 */
public interface TicketDao {

    /**
     * 通过ID查询单条数据
     *
     * @param checkTickedId 主键
     * @return 实例对象
     */
    Ticket queryById(String checkTickedId);



}