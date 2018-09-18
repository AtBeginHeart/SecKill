package com.seckill.project.seckillsystem.exceptions;
/**
 * 秒杀关闭异常
 * */
public class SecKillCloseException extends SeckillException {
 public SecKillCloseException(String message){
     super(message);
 }
 public  SecKillCloseException(String message,Throwable cause){
     super(message,cause);
 }

}
