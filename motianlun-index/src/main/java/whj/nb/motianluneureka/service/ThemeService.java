package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.PageBean;
import whj.nb.motianluneureka.entity.Theme;

import java.util.List;

/**
 * (Theme)表服务接口
 *
 * @author makejava
 * @since 2020-08-25 18:51:38
 */
public interface ThemeService {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param limit
     * @param pageNum
     * @param pageSize
     * @return 对象列表
     */
    PageBean queryAll(Integer limit,Integer pageNum,Integer pageSize);

}