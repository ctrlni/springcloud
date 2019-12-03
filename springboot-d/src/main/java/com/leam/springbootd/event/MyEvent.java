package com.leam.springbootd.event;

import org.springframework.context.ApplicationEvent;

/**
 * 事件类
 */
public class MyEvent extends ApplicationEvent {
    public String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     *
     * @param source 发布的消息
     * @param msg
     */
    public MyEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }
}
