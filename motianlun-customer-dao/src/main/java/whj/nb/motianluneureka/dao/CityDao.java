package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.City;

import java.util.List;

/**
 * (City)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 09:01:19
 */
@Mapper
public interface CityDao {

    /**
     * 通过ID查询首字母相同城市
     *
     * @param cityId 主键
     * @return 实例对象
     */
    List<City> queryById(Integer cityId);



    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<City> queryAll();



}