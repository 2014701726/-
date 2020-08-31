package whj.nb.performance.controller;

import whj.nb.performance.entity.PerformanceType;
import whj.nb.performance.service.PerformanceTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PerformanceType)表控制层
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
@RestController
@RequestMapping("performanceType")
public class PerformanceTypeController {
    /**
     * 服务对象
     */
    @Resource
    private PerformanceTypeService performanceTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PerformanceType selectOne(String id) {
        return this.performanceTypeService.queryById(id);
    }

}