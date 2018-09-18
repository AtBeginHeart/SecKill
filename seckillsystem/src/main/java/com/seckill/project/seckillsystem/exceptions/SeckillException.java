package com.seckill.project.seckillsystem.exceptions;
/**
 * 秒杀业务所有业务异常
 * */
public class SeckillException extends RuntimeException{
    /**
     * 如果不是运行时异常，那就是编译时异常（通常用trycatch来解决），这里应该用runtime异常
     * */
    public SeckillException(String message){
        super(message);
    }

    public SeckillException(String message,Throwable cause){
     //这里的Throwable是个什么鬼？
        /**
         * Throwable 类是 Java 语言中所有错误或异常的超类。只有当对象是此类（或其子类之一）的实例时，才能通过 Java 虚拟机或者 Java throw 语句抛出。类似地，只有此类或其子类之一才可以是 catch 子句中的参数类型。
         * */
        super(message,cause);
    }








}
