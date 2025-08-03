package br.com.bmtptecnologia.school.infrastructure.domain;

import br.com.bmtptecnologia.school.domain.address.repository.AddressRepository;
import br.com.bmtptecnologia.school.domain.outbox.repository.OutboxRepository;
import br.com.bmtptecnologia.school.domain.student.repository.StudentRepository;
import br.com.bmtptecnologia.school.infrastructure.repository.address.AddressRepositoryImpl;
import br.com.bmtptecnologia.school.infrastructure.repository.outbox.OutboxRepositoryImpl;
import br.com.bmtptecnologia.school.infrastructure.repository.student.StudentRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Repository {

    @Bean
    public AddressRepository addressRepository() {
        return new AddressRepositoryImpl();
    }

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepositoryImpl();
    }

    @Bean
    public OutboxRepository outboxRepository() {
        return new OutboxRepositoryImpl();
    }
}
