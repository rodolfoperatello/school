package br.com.bmtptecnologia.school.application.service;

import br.com.bmtptecnologia.school.application.dto.CreateAddressDTO;
import br.com.bmtptecnologia.school.application.dto.CreateStudentDTO;

public interface CreateStudentAndAddressService {
   void execute(CreateStudentDTO createStudentDTO, CreateAddressDTO createAddressDTO);
}
