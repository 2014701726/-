package whj.nb.nbmanager.service;

import whj.nb.nbmanager.bean.User;

import java.util.List;

public interface VipService {
    List<User> findAllUser();
    Integer setVip(String userId);
    Integer delVip(String userid);
}
