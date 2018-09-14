package com.seckill.project.seckillsystem.SecKillManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
