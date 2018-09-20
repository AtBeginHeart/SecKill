package com.seckill.project.seckillsystem.BusinessSecKill;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BusinessSecKillMapper {
    //查询某个商品的数量
    @Select("SELECT business_count FROM businessinfo WHERE id = 1")
    public int queryBusinessCount();
    //更新商品数量
    //public void updateCount();
}
