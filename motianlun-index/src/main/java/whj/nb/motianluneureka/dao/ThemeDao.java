package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Theme;

import java.util.List;

/**
 * (Theme)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-25 18:51:38
 */
@Mapper
public interface ThemeDao {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param limit
     * @return 对象列表
     */
    List<Theme> queryAll(Integer limit);


}