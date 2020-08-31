package whj.nb.nbmanager.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.nbmanager.bean.User;
import whj.nb.nbmanager.dao.VipDao;
import whj.nb.nbmanager.service.VipService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VipServiceImpl implements VipService{
    @Resource
    private VipDao vipDao;

    @Override
    public List<User> findAllUser() {
        return vipDao.findAllUser();
    }

    @Override
    public Integer setVip(String userId) {
        return vipDao.setVip(userId);
    }

    @Override
    public Integer delVip(String userid) {
        return vipDao.delVip(userid);
    }
}
