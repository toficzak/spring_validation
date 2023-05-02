package com.github.toficzak.simple_rabbit_checker.example;

import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.RabbitListenerErrorHandler;
import org.springframework.amqp.rabbit.support.ListenerExecutionFailedException;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ErrorHandler implements RabbitListenerErrorHandler {

    @Override
    public Object handleError(Message message, org.springframework.messaging.Message<?> message1, ListenerExecutionFailedException e) throws Exception {

        if (e.getCause() instanceof ConstraintViolationException) {
            var constraintException = e.getCause();
            log.error("Constraint exception: " + constraintException.getMessage());
        } else {
            log.error("Exception!");
        }
        return null;
    }
}
