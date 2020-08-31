package whj.nb.nbmanager.dao;

import whj.nb.nbmanager.bean.User;

import java.util.List;

public interface VipDao {
    List<User> findAllUser();
    Integer setVip(String userId);
    Integer delVip(String userid);
}
