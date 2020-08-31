package whj.nb.goodsdetail.service;

import whj.nb.goodsdetail.bean.Good;

import java.util.List;

public interface GoodService {
    Good findByid(String id);
    List<Good> reGoodList(String id);
    List<Good> findAllGoods();
}
