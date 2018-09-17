package com.seckill.project.seckillsystem.SecKillManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller //注意这里一定是Controller
public class SeckillViewController {
    /**
     * 结果是没有跳转到相应的页面上面
     * */
    @RequestMapping("/index")
    public String test(){
        return "index";
    }

}
