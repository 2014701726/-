package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.City;

import java.util.List;

/**
 * (City)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 09:01:20
 */
public interface CityService {

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    List<City> queryById(Integer cityId);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<City> queryAll();



}