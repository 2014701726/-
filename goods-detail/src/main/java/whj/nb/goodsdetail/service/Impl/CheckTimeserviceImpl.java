package whj.nb.goodsdetail.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.goodsdetail.bean.CheckTime;
import whj.nb.goodsdetail.bean.Good;
import whj.nb.goodsdetail.dao.CheckTimeDao;
import whj.nb.goodsdetail.dao.GoodDao;
import whj.nb.goodsdetail.service.CheckTimeService;
import whj.nb.goodsdetail.service.GoodService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CheckTimeserviceImpl implements CheckTimeService {

    @Resource
    private CheckTimeDao checkTimeDao;

    @Override
    public List<CheckTime> findByid(String id) {
        return checkTimeDao.findByid(id);
    }
}
