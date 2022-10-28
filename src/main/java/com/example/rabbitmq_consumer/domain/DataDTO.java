package com.example.rabbitmq_consumer.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class DataDTO {

    private String apiName;
    private String brokerName;
    private String nowDate;

}

