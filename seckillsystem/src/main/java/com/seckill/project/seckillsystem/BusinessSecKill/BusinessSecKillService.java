package com.seckill.project.seckillsystem.BusinessSecKill;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class BusinessSecKillService {
   // private  final Logger logger = (Logger) LoggerFactory.getLogger( BusinessSecKillService.class );
   int i =1;
    @Resource
    BusinessSecKillMapper businessSecKillMapper;
    public String businessSeckill(){
         String result = "";
        int businessSec = businessSecKillMapper.queryBusinessCount();
        if (businessSec<=0){
           // logger.info( "商品已经被抢完，谢谢您的参与" );
            return "活动结束";
        }
        if (businessSec>0){

           // logger.info( "秒杀查询结果为"+businessSec );
            result = "恭喜您抢到了iPhoneX";
            System.out.println( result );
            System.out.println( i++ );
            //更新数据库数据
        }
        return result;
    }

}
