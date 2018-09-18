package com.seckill.project.seckillsystem.SecKillManager;

import com.seckill.project.seckillsystem.utils.SeckillResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SeckillManagerController {
    @Autowired
    SeckillManagerService seckillManagerService;
    @RequestMapping("/secKill")
    public String secKill(){
        return "welcome to seckill system";
    }
    @RequestMapping("/secKill2db")
    public String secKill2db(){
        return seckillManagerService.seckill2dbService();
    }
    @RequestMapping("/seckillMappertest")
    public String secKill3db(){
        return seckillManagerService.seckillofMapper();
    }
    //获取系统时间
    @RequestMapping(value = "/time/now",method = RequestMethod.GET)
    @ResponseBody
    public SeckillResult<Long> time()
    {
        Date now=new Date();
        return new SeckillResult<Long>(true,now.getTime());
    }

}
