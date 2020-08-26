package whj.nb.goodsdetail.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.goodsdetail.bean.Good;
import whj.nb.goodsdetail.dao.GoodDao;
import whj.nb.goodsdetail.service.GoodService;

import javax.annotation.Resource;

@Service
public class GoodserviceImpl implements GoodService {

    @Resource
    private GoodDao goodDao;
    @Override
    public Good findByid(String id) {
        return goodDao.findByid(id);
    }
}
