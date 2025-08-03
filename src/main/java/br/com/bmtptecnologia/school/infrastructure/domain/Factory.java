package br.com.bmtptecnologia.school.infrastructure.domain;

import br.com.bmtptecnologia.school.domain.address.factory.AddressFactory;
import br.com.bmtptecnologia.school.domain.address.factory.AddressFactoryImpl;
import br.com.bmtptecnologia.school.domain.outbox.factory.OutboxFactory;
import br.com.bmtptecnologia.school.domain.outbox.factory.OutboxFactoryImpl;
import br.com.bmtptecnologia.school.domain.student.factory.CreateStudentFactory;
import br.com.bmtptecnologia.school.domain.student.factory.CreateStudentFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {

    @Bean
    public AddressFactory addressFactory() {
        return new AddressFactoryImpl();
    }

    @Bean
    public CreateStudentFactory studentFactory() {
        return new CreateStudentFactoryImpl();
    }

    @Bean
    public OutboxFactory outboxFactory() {
        return new OutboxFactoryImpl();
    }
}
