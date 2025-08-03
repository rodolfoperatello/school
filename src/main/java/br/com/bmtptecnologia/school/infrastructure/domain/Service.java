package br.com.bmtptecnologia.school.infrastructure.domain;

import br.com.bmtptecnologia.school.domain.outbox.repository.OutboxRepository;
import br.com.bmtptecnologia.school.domain.outbox.service.OutboxService;
import br.com.bmtptecnologia.school.domain.outbox.service.OutboxServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Service {

    @Bean
    public OutboxService outboxService(OutboxRepository outboxRepository) {
        return new OutboxServiceImpl(outboxRepository);
    }
}
