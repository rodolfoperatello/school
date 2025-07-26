package br.com.bmtptecnologia.school.domain.usecase;

import br.com.bmtptecnologia.school.domain.address.AddressEntity;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;

public interface PersistAddressAndStudentUseCase {
   void execute(AddressEntity addressEntity, StudentEntity studentEntity);
}
