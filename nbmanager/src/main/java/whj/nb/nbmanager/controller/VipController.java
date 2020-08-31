package whj.nb.nbmanager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.nbmanager.bean.User;
import whj.nb.nbmanager.service.Impl.VipServiceImpl;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("vip")
public class VipController {
    @Resource
    private VipServiceImpl vipService;

    @RequestMapping("allUser")
    public ResultVO toAllUser(){
        List<User> allUser = vipService.findAllUser();
        return new ResultVO(1,"success",allUser);
    }

    @RequestMapping("/setUserVip/{userId}")
    public ResultVO toSetVip(@PathVariable("userId") String userId){
        Integer integer = vipService.setVip(userId);
        return new ResultVO(1,"success",integer);
    }

    @RequestMapping("/delUserVip/{userId}")
    public ResultVO toDelVip(@PathVariable("userId") String userId){
        Integer integer = vipService.delVip(userId);
        return new ResultVO(1,"success",integer);
    }

}
