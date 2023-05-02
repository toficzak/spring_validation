package com.github.toficzak.simple_rabbit_checker.example;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@Validated
@Slf4j
public class QueueReceiver {

    @RabbitListener(queues = "queue", errorHandler = "errorHandler")
    public void receive2(@Valid @Payload ValidatedBook book) {
        log.info(" [x] (queue) Received '" + book + "'");
    }
}
