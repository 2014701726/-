package whj.nb.goodsdetail.dao;


import whj.nb.goodsdetail.bean.CheckTime;

import java.util.List;

public interface CheckTimeDao {
    List<CheckTime> findByid(String id);
}
