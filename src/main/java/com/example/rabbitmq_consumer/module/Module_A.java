package com.example.rabbitmq_consumer.module;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Module_A {

   /*
   // bindings 정보를 하나하나 적어줘도 되는데 번거롭다
   @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "myExchange", type= ExchangeTypes.DIRECT), // exchange
            key = "mail_1_key", // routing key
            value = @Queue(name="mail_1") // queue name
    ))
    */
    @RabbitListener(queues = "mail_1") // 메시지가 오는것을 감시하는 역할
    public void getText(String msg) {
        System.out.println("[getText] mail_1 " + msg);
    }
}



