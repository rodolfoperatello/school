package br.com.bmtptecnologia.school.infrastructure.event.kafka.producer;

import br.com.bmtptecnologia.school.domain.event.EventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaEventProducerImpl implements EventProducer {
    private final KafkaTemplate kafkaTemplate;

    @Autowired
    public KafkaEventProducerImpl(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @Override
    public void send(byte[] msg) {

    }

    @Override
    public String eventDestination() {
        return "";
    }
}
