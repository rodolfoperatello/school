package br.com.bmtptecnologia.school.infrastructure.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.bmtptecnologia.school.domain.address.factory.AddressFactory;
import br.com.bmtptecnologia.school.domain.address.factory.AddressFactoryImpl;
import br.com.bmtptecnologia.school.domain.address.repository.AddressRepository;
import br.com.bmtptecnologia.school.domain.address.usecase.CreateAddressUseCase;
import br.com.bmtptecnologia.school.domain.address.usecase.CreateAddressUseCaseImpl;
import br.com.bmtptecnologia.school.domain.student.factory.CreateStudentFactory;
import br.com.bmtptecnologia.school.domain.student.factory.CreateStudentFactoryImpl;
import br.com.bmtptecnologia.school.domain.student.repository.StudentRepository;
import br.com.bmtptecnologia.school.domain.student.usecase.CreateStudentUseCase;
import br.com.bmtptecnologia.school.domain.student.usecase.CreateStudentUseCaseImpl;
import br.com.bmtptecnologia.school.domain.usecase.PersistAddressAndStudentUseCase;
import br.com.bmtptecnologia.school.domain.usecase.PersistAddressAndStudentUseCaseImpl;
import br.com.bmtptecnologia.school.infrastructure.repository.address.AddressRepositoryImpl;
import br.com.bmtptecnologia.school.infrastructure.repository.student.StudentRepositoryImpl;

@Configuration
public class BeanConfig {
   @Bean
   public AddressRepository addressRepository() {
      return new AddressRepositoryImpl();
   }

   @Bean
   public StudentRepository studentRepository() {
      return new StudentRepositoryImpl();
   }

   @Bean
   public AddressFactory addressFactory() {
      return new AddressFactoryImpl();
   }

   @Bean
   public CreateStudentFactory studentFactory() {
      return new CreateStudentFactoryImpl();
   }

   @Bean
   public CreateAddressUseCase createAddressUseCase(AddressFactory addressFactory) {
      return new CreateAddressUseCaseImpl(addressFactory);
   }

   @Bean
   public CreateStudentUseCase createStudentUseCase(CreateStudentFactory createStudentFactory) {
      return new CreateStudentUseCaseImpl(createStudentFactory);
   }

   @Bean
   public PersistAddressAndStudentUseCase persistAddressAndStudentUseCase(
       AddressRepository addressRepository,
       StudentRepository studentRepository) {
      return new PersistAddressAndStudentUseCaseImpl(addressRepository, studentRepository);
   }
}
