package com.example.rabbitmq_consumer.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor // 기본 생성자를 반드시 필요로 합니다
@ToString
public class DataDTO {

    private String apiName;
    private String brokerName;
    private String nowDate;

}

