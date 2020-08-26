package whj.nb.goodsdetail.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.goodsdetail.bean.Good;
import whj.nb.goodsdetail.bean.Sku;
import whj.nb.goodsdetail.dao.GoodDao;
import whj.nb.goodsdetail.dao.SkuDao;
import whj.nb.goodsdetail.service.GoodService;
import whj.nb.goodsdetail.service.SkuService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SkuserviceImpl implements SkuService{

    @Resource
    private SkuDao skuDao;
    @Override
    public List<Sku> findByid(String id) {
        return skuDao.findByid(id);
    }



}
