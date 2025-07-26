package br.com.bmtptecnologia.school.domain.usecase;

import br.com.bmtptecnologia.school.domain.address.AddressEntity;
import br.com.bmtptecnologia.school.domain.address.repository.AddressRepository;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.repository.StudentRepository;

public class PersistAddressAndStudentUseCaseImpl implements PersistAddressAndStudentUseCase {
   private final AddressRepository addressRepository;
   private final StudentRepository studentRepository;

   public PersistAddressAndStudentUseCaseImpl(AddressRepository addressRepository,
                                              StudentRepository studentRepository) {
      this.addressRepository = addressRepository;
      this.studentRepository = studentRepository;
   }

   @Override
   public void execute(AddressEntity addressEntity, StudentEntity studentEntity) {
      Long addressId = this.addressRepository.create(addressEntity);

      studentEntity.changeAddress(addressId);

      this.studentRepository.create(studentEntity);
   }
}
