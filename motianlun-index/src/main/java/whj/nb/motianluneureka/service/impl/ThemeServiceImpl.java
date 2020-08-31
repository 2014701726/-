package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.cache.CacheStrategy;
import whj.nb.motianluneureka.cache.RedisCacheHandler;
import whj.nb.motianluneureka.dao.ThemeDao;
import whj.nb.motianluneureka.entity.PageBean;
import whj.nb.motianluneureka.entity.Theme;
import whj.nb.motianluneureka.service.ThemeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Theme)表服务实现类
 *
 * @author makejava
 * @since 2020-08-25 18:51:39
 */
@Service("themeService")
public class ThemeServiceImpl implements ThemeService {
    @Resource
    private ThemeDao themeDao;
    @Resource
    private RedisCacheHandler redisCacheHandler;


    @Override
    public PageBean queryAll(Integer limit,Integer pageNum ,Integer pageSize) {
        String key = "theme_limit_"+limit+"_pageNum_"+pageNum+"_pageSize_"+pageSize;
        return redisCacheHandler.cache(key, PageBean.class, new CacheStrategy() {
            @Override
            public Object strategy() {
                PageBean pageBean = new PageBean();
                List<Theme> themeList = themeDao.queryAll(limit);
                pageBean.setThemeList(themeList);
                return pageBean;
            }
        });
    }
}