package br.com.bmtptecnologia.school.domain.usecase;

import br.com.bmtptecnologia.school.domain.address.AddressEntity;
import br.com.bmtptecnologia.school.domain.address.repository.AddressRepository;
import br.com.bmtptecnologia.school.domain.outbox.OutboxEntity;
import br.com.bmtptecnologia.school.domain.outbox.repository.OutboxRepository;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.repository.StudentRepository;
import org.springframework.transaction.annotation.Transactional;

public class PersistAddressAndStudentUseCaseImpl implements PersistAddressAndStudentUseCase {
   private final AddressRepository addressRepository;
   private final StudentRepository studentRepository;
   private final OutboxRepository outboxRepository;

   public PersistAddressAndStudentUseCaseImpl(AddressRepository addressRepository,
                                              StudentRepository studentRepository,
                                              OutboxRepository outboxRepository) {
      this.addressRepository = addressRepository;
      this.studentRepository = studentRepository;
      this.outboxRepository = outboxRepository;
   }

   @Override
   @Transactional // remover e implementar o transacional manualmente
   public void execute(AddressEntity addressEntity, StudentEntity studentEntity, OutboxEntity outboxEntity) {
      Long addressId = this.addressRepository.save(addressEntity);

      studentEntity.changeAddress(addressId);

      this.studentRepository.save(studentEntity);

      this.outboxRepository.save(outboxEntity);
   }
}
