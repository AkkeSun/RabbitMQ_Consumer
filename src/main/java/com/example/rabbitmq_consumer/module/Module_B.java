package com.example.rabbitmq_consumer.module;

import com.example.rabbitmq_consumer.domain.DataDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@Log4j2
public class Module_B {

    @RabbitListener(queues = "mail_2", concurrency = "3")
    public String getDto(DataDTO dto) throws InterruptedException {
        Thread.sleep(3000);
        log.info("   [getDto] mail_2 " + dto.toString());
        return dto.toString();
    }
}
