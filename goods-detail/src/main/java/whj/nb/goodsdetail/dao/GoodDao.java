package whj.nb.goodsdetail.dao;

import whj.nb.goodsdetail.bean.Good;

public interface GoodDao {
    Good findByid(String id);
}
