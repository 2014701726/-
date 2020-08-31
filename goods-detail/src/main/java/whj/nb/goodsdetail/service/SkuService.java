package whj.nb.goodsdetail.service;

import whj.nb.goodsdetail.bean.Good;
import whj.nb.goodsdetail.bean.Sku;

import java.util.List;

public interface SkuService {
    List<Sku> findByid(String id);
}
