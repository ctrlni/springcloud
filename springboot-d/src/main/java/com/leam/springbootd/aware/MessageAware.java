package com.leam.springbootd.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * 消息
 */
@Component
public class MessageAware implements MessageSourceAware {
    @Override
    public void setMessageSource(MessageSource messageSource) {
    }
}
