package whj.nb.goodsdetail.dao;

import whj.nb.goodsdetail.bean.Sku;

import java.util.List;

public interface SkuDao {
    List<Sku> findByid(String id);
}
