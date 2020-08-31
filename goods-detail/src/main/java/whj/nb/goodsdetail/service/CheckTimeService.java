package whj.nb.goodsdetail.service;

import whj.nb.goodsdetail.bean.CheckTime;
import whj.nb.goodsdetail.bean.Good;

import java.util.List;

public interface CheckTimeService {
    List<CheckTime> findByid(String id);
}
