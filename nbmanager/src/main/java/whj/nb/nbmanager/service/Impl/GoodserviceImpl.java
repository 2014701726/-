package whj.nb.nbmanager.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.nbmanager.bean.Good;
import whj.nb.nbmanager.dao.GoodDao;
import whj.nb.nbmanager.service.GoodService;


import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodserviceImpl implements GoodService {

    @Resource
    private GoodDao goodDao;
    @Override
    public Good findByid(String id) {
        return goodDao.findByid(id);
    }

    @Override
    public List<Good> reGoodList(String id) {
        return goodDao.reGoodList(id);
    }

    @Override
    public Integer addGood(Good good) {
        return goodDao.addGood(good);
    }
}
