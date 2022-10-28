package com.example.rabbitmq_consumer.module;

import com.example.rabbitmq_consumer.domain.DataDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Module_A {

/*    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "sunTest", type= ExchangeTypes.DIRECT), // exchange
            key = "time-first", // routing key
            value = @Queue(name="time-second") // queue name
    ))*/
    @RabbitListener(queues = "mail_1")
    public void getText(String msg) {
        System.out.println("[getText] mail_1 " + msg);
    }

/*    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "dto", type= ExchangeTypes.DIRECT),  // exchang
            key = "dto-first", // routing key
            value = @Queue(name="dto-second") // queue name
    ))
    @SendTo("dto/dto-third")
    */
    @RabbitListener(queues = "mail_1")
    public void getDto(DataDTO dto) {
        System.out.println("   [getDto] mail_1 " + dto.toString());
    }

}



