package br.com.bmtptecnologia.school.infrastructure.bean;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Kafka {

    @Bean
    public KafkaAdmin admin() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(AdminClientConfig.BOOTSTRAP_CONTROLLERS_CONFIG, "localhost:9092");

        return new KafkaAdmin(configProps);
    }

    @Bean
    public NewTopic topic1() {
        return TopicBuilder
                .name("")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
