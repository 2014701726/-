package whj.nb.nbmanager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.nbmanager.bean.UserInfo;
import whj.nb.nbmanager.service.Impl.UserServiceImpl;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserContorller {
    @Resource
    private UserServiceImpl userService;

    @RequestMapping("login")
    public ResultVO toLogin(@RequestBody UserInfo user){
        UserInfo login = userService.login(user);
        if(login!=null){
            return new ResultVO(1,"success",login);
        }
        return new ResultVO(0,"fail",login);
    }
}
