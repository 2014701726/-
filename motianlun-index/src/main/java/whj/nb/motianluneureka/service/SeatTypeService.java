package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.SeatType;

import java.util.List;

/**
 * (SeatType)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 10:23:06
 */
public interface SeatTypeService {

    /**
     * 通过实体作为筛选条件查询
     *
     *
     * @return 对象列表
     */
    List<SeatType> queryAll();

}