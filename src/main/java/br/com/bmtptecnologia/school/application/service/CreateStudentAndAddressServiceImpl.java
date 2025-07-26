package br.com.bmtptecnologia.school.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bmtptecnologia.school.application.dto.CreateAddressDTO;
import br.com.bmtptecnologia.school.application.dto.CreateStudentDTO;
import br.com.bmtptecnologia.school.domain.address.AddressEntity;
import br.com.bmtptecnologia.school.domain.address.usecase.CreateAddressUseCase;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.usecase.CreateStudentUseCase;
import br.com.bmtptecnologia.school.domain.usecase.PersistAddressAndStudentUseCase;

@Service
public class CreateStudentAndAddressServiceImpl implements CreateStudentAndAddressService {
   private final CreateStudentUseCase createStudentUseCase;
   private final CreateAddressUseCase createAddressUseCase;
   private final PersistAddressAndStudentUseCase persistAddressAndStudentUseCase;

   @Autowired
   public CreateStudentAndAddressServiceImpl(CreateStudentUseCase createStudentUseCase,
                                             CreateAddressUseCase createAddressUseCase,
                                             PersistAddressAndStudentUseCase persistAddressAndStudentUseCase) {
      this.createStudentUseCase = createStudentUseCase;
      this.createAddressUseCase = createAddressUseCase;
      this.persistAddressAndStudentUseCase = persistAddressAndStudentUseCase;
   }

   @Override
   public void execute(CreateStudentDTO createStudentDTO, CreateAddressDTO createAddressDTO) {
      AddressEntity addressEntity = this.createAddressUseCase.execute(createAddressDTO);

      StudentEntity studentEntity = this.createStudentUseCase.execute(createStudentDTO);

      this.persistAddressAndStudentUseCase.execute(addressEntity, studentEntity);
   }
}
