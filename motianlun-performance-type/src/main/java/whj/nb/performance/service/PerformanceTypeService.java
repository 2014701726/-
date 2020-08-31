package whj.nb.performance.service;

import whj.nb.performance.entity.PerformanceType;
import java.util.List;

/**
 * (PerformanceType)表服务接口
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
public interface PerformanceTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param performanceTypeId 主键
     * @return 实例对象
     */
    PerformanceType queryById(String performanceTypeId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PerformanceType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param performanceType 实例对象
     * @return 实例对象
     */
    PerformanceType insert(PerformanceType performanceType);

    /**
     * 修改数据
     *
     * @param performanceType 实例对象
     * @return 实例对象
     */
    PerformanceType update(PerformanceType performanceType);

    /**
     * 通过主键删除数据
     *
     * @param performanceTypeId 主键
     * @return 是否成功
     */
    boolean deleteById(String performanceTypeId);

}