package whj.nb.goodsdetail.dao;

import whj.nb.goodsdetail.bean.Good;

import java.util.List;

public interface GoodDao {
    Good findByid(String id);
    List<Good> reGoodList(String id);
    List<Good> findAllGoods();
}
