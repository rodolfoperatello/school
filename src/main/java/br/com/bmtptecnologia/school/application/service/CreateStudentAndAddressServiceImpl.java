package br.com.bmtptecnologia.school.application.service;

import br.com.bmtptecnologia.school.application.dto.CreateAddressDTO;
import br.com.bmtptecnologia.school.application.dto.CreateStudentDTO;
import br.com.bmtptecnologia.school.domain.address.AddressEntity;
import br.com.bmtptecnologia.school.domain.address.usecase.CreateAddressUseCase;
import br.com.bmtptecnologia.school.domain.address.vo.CreateAddressVO;
import br.com.bmtptecnologia.school.domain.outbox.usecase.CreateOutboxUseCase;
import br.com.bmtptecnologia.school.domain.outbox.vo.OutboxVO;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.usecase.CreateStudentUseCase;
import br.com.bmtptecnologia.school.domain.student.vo.CreateStudentVO;
import br.com.bmtptecnologia.school.domain.usecase.PersistAddressAndStudentUseCase;
import br.com.bmtptecnologia.school.domain.outbox.OutboxEntity;

public class CreateStudentAndAddressServiceImpl implements CreateStudentAndAddressService {
   private final CreateStudentUseCase createStudentUseCase;
   private final CreateAddressUseCase createAddressUseCase;
   private final CreateOutboxUseCase createOutboxUseCase;
   private final PersistAddressAndStudentUseCase persistAddressAndStudentUseCase;

   public CreateStudentAndAddressServiceImpl(CreateStudentUseCase createStudentUseCase,
                                             CreateAddressUseCase createAddressUseCase,
                                             CreateOutboxUseCase createOutboxUseCase,
                                             PersistAddressAndStudentUseCase persistAddressAndStudentUseCase) {
      this.createStudentUseCase = createStudentUseCase;
      this.createAddressUseCase = createAddressUseCase;
      this.createOutboxUseCase = createOutboxUseCase;
      this.persistAddressAndStudentUseCase = persistAddressAndStudentUseCase;
   }

   @Override
   public void execute(CreateStudentDTO createStudentDTO, CreateAddressDTO createAddressDTO) {
      CreateAddressVO createAddressVO = this.fromDTOtoVO(createAddressDTO);

      AddressEntity addressEntity = this.createAddressUseCase.execute(createAddressVO);

      CreateStudentVO createStudentVO = this.fromDTOtoVO(createStudentDTO);

      StudentEntity studentEntity = this.createStudentUseCase.execute(createStudentVO);

      OutboxVO outboxVO = this.fromDTOtoVO();

      OutboxEntity outboxEntity = this.createOutboxUseCase.execute(outboxVO);

      this.persistAddressAndStudentUseCase.execute(addressEntity, studentEntity, outboxEntity);
   }

   private CreateAddressVO fromDTOtoVO (CreateAddressDTO createAddressDTO) {
      return new CreateAddressVO(
              createAddressDTO.getStreet(),
              createAddressDTO.getNumber(),
              createAddressDTO.getNeighborhood(),
              createAddressDTO.getCity(),
              createAddressDTO.getState()
      );
   }

   private CreateStudentVO fromDTOtoVO(CreateStudentDTO createStudentDTO) {
      return new CreateStudentVO(
              createStudentDTO.getName(),
              createStudentDTO.getLastName(),
              createStudentDTO.getPhone(),
              createStudentDTO.getBirthday()
      );
   }

   private OutboxVO fromDTOtoVO() {
      return new OutboxVO();
   }
}
