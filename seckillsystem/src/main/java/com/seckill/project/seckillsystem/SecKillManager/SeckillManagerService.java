package com.seckill.project.seckillsystem.SecKillManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@ComponentScan({"org.apache.ibatis.annotations.Mapper"})
public class SeckillManagerService {
    @Resource //@Resource 和@AutoWire有什么区别?
    SecKillMapper secKillMapper;
    public String seckill2dbService(){
        return "now,you're at service layer!";
    }
    //mapper 集成测试
    public String seckillofMapper(){
        return secKillMapper.seckillMapper();
    }
}
