package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.CheckTime;

import java.util.List;

/**
 * (CheckTime)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 10:04:56
 */
public interface CheckTimeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param checkTicketId
     * @return 实例对象
     */
    CheckTime queryById(String checkTicketId);



}