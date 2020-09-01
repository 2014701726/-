package whj.nb.nbmanager.dao;



import whj.nb.nbmanager.bean.Good;

import java.util.List;

public interface GoodDao {
    Good findByid(String id);
    List<Good> reGoodList(String id);
    Integer addGood(Good good);
    Integer delGood(String goodId);
    Integer updateGood(Good good);
}
