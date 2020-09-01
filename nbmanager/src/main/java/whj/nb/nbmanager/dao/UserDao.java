package whj.nb.nbmanager.dao;


import whj.nb.nbmanager.bean.UserInfo;

public interface UserDao {
    UserInfo login(UserInfo user);
}
