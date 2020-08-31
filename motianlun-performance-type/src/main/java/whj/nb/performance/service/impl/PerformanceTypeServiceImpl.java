package whj.nb.performance.service.impl;

import whj.nb.performance.entity.PerformanceType;
import whj.nb.performance.dao.PerformanceTypeDao;
import whj.nb.performance.service.PerformanceTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PerformanceType)表服务实现类
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
@Service("performanceTypeService")
public class PerformanceTypeServiceImpl implements PerformanceTypeService {
    @Resource
    private PerformanceTypeDao performanceTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param performanceTypeId 主键
     * @return 实例对象
     */
    @Override
    public PerformanceType queryById(String performanceTypeId) {
        return this.performanceTypeDao.queryById(performanceTypeId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PerformanceType> queryAllByLimit(int offset, int limit) {
        return this.performanceTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param performanceType 实例对象
     * @return 实例对象
     */
    @Override
    public PerformanceType insert(PerformanceType performanceType) {
        this.performanceTypeDao.insert(performanceType);
        return performanceType;
    }

    /**
     * 修改数据
     *
     * @param performanceType 实例对象
     * @return 实例对象
     */
    @Override
    public PerformanceType update(PerformanceType performanceType) {
        this.performanceTypeDao.update(performanceType);
        return this.queryById(performanceType.getPerformanceTypeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param performanceTypeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String performanceTypeId) {
        return this.performanceTypeDao.deleteById(performanceTypeId) > 0;
    }
}