package com.seckill.project.seckillsystem;

import com.seckill.project.seckillsystem.SecKillManager.SeckillManagerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillsystemApplicationTests {
    @Autowired
	SeckillManagerService seckillManagerService;
	@Test
	public void contextLoads() {
	    System.out.println( "test start" );
	String seckillingo = seckillManagerService.seckillofMapper();
	System.out.println("seckill"+seckillingo);
        System.out.println( "test end" );
	}

}
