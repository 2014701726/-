package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.CityDao;
import whj.nb.motianluneureka.entity.City;
import whj.nb.motianluneureka.service.CityService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (City)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 09:01:21
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    @Override
    public List<City> queryById(Integer cityId) {
        List<City> cityList = this.cityDao.queryById(cityId);
        return cityList;
    }

    /**
     * 查询所有城市
     * @return
     */
    @Override
    public List<City> queryAll() {
        List<City> cityList = this.cityDao.queryAll();
        return cityList;
    }


}