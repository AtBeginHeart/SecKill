package com.seckill.project.seckillsystem.BusinessSecKill;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class BusinessSecKillController {
    //private  final Logger logger = (Logger) LoggerFactory.getLogger( BusinessSecKillController.class );
    @Autowired
    BusinessSecKillService businessSecKillService;
    @RequestMapping("/businessSecKill")
    public  String BusinessSecKill(){
        //logger.info( "=================secKillStart========================" );
        return businessSecKillService.businessSeckill();
    }
}
