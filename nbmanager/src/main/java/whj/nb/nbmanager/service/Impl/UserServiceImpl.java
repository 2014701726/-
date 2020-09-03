package whj.nb.nbmanager.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.nbmanager.bean.User;
import whj.nb.nbmanager.bean.UserInfo;
import whj.nb.nbmanager.dao.UserDao;
import whj.nb.nbmanager.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    @Override
    public UserInfo login(UserInfo user) {
        return userDao.login(user);
    }
}
