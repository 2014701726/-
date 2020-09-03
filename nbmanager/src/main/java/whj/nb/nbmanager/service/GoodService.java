package whj.nb.nbmanager.service;


import whj.nb.nbmanager.bean.Good;

import java.util.List;

public interface GoodService {
    Good findByid(String id);
    List<Good> reGoodList(String id);
    Integer addGood(Good good);
    Integer delGood(String goodId);
    Integer updateGood(Good good);
}
