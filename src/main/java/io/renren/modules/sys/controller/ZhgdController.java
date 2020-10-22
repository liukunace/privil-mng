package io.renren.modules.sys.controller;

import io.renren.common.utils.R;
import io.renren.modules.sys.entity.MasPersonalEntity;
import io.renren.modules.sys.service.impl.MasPersonalServiceImpl;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: liukun
 * @create: 2020-08-04 22:31
 */
@RestController
@RequestMapping("/zhgd")
public class ZhgdController extends AbstractController{

    @Autowired
    private MasPersonalServiceImpl masPersonalServiceImpl;

    @GetMapping("/test")
    public String test(){
        return "zhgd-sys-test";
    }

    @GetMapping("/user")
    public MasPersonalEntity user(){
        MasPersonalEntity user= masPersonalServiceImpl.queryByUserName("王保国");
        return user;
    }

    @GetMapping("/user2")
    public R user2(){
        MasPersonalEntity user= masPersonalServiceImpl.queryByUserName("王保国");
        //return R.ok().put("user",user);
        return R.ok("success").put("user",user);
    }

    @GetMapping("/err")
    public R err(){
        return R.error(400,"服务器连接失败11111111111111111111");
    }
    @GetMapping("/err2")
    public R err2(){
        return R.error("服务器连接失败2222222222222222222222222");
    }

    @GetMapping("/err3")
    public R err3(){
        return R.error();
    }


    @GetMapping("/err4")
    public R err4(){
        return R.error(HttpStatus.SC_UNAUTHORIZED, "invalid token44444444444");

    }


}
