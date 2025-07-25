package br.com.bmtptecnologia.school.domain.student;

import br.com.bmtptecnologia.school.domain.address.repository.AddressRepository;
import br.com.bmtptecnologia.school.domain.student.repository.StudentRepository;

public class CreateStudentUseCaseImpl implements CreateStudentUseCase {

   private final StudentRepository studentRepository;
   private final AddressRepository addressRepository;

   public CreateStudentUseCaseImpl(StudentRepository studentRepository,
                                   AddressRepository addressRepository) {
      this.studentRepository = studentRepository;
      this.addressRepository = addressRepository;
   }

   @Override
   public void execute() {

      this.addressRepository.create(null);

      this.studentRepository.create(null);

   }
}
