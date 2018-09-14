package com.seckill.project.seckillsystem.SecKillManager;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SecKillMapper {
    @Select("SELECT seckilltest FROM sekillmaster")
    public String seckillMapper();
}
