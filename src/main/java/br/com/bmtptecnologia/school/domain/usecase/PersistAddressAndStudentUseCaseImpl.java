package br.com.bmtptecnologia.school.domain.usecase;

import br.com.bmtptecnologia.school.domain.address.AddressEntity;
import br.com.bmtptecnologia.school.domain.address.repository.AddressRepository;
import br.com.bmtptecnologia.school.domain.outbox.service.OutboxService;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.repository.StudentRepository;
import org.springframework.transaction.annotation.Transactional;

public class PersistAddressAndStudentUseCaseImpl implements PersistAddressAndStudentUseCase {
   private final AddressRepository addressRepository;
   private final StudentRepository studentRepository;
   private final OutboxService outboxService;

   public PersistAddressAndStudentUseCaseImpl(AddressRepository addressRepository,
                                              StudentRepository studentRepository,
                                              OutboxService outboxService) {
      this.addressRepository = addressRepository;
      this.studentRepository = studentRepository;
      this.outboxService = outboxService;
   }

   @Override
   @Transactional // remover e implementar o transacional manualmente
   public void execute(AddressEntity addressEntity, StudentEntity studentEntity) {
      Long addressId = this.addressRepository.create(addressEntity);

      studentEntity.changeAddress(addressId);

      this.studentRepository.create(studentEntity);

      this.outboxService.saveEvent();
   }
}
