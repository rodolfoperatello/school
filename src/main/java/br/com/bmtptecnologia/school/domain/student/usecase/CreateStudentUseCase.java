package br.com.bmtptecnologia.school.domain.student.usecase;

import br.com.bmtptecnologia.school.application.dto.CreateStudentDTO;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;

public interface CreateStudentUseCase {
   StudentEntity execute(CreateStudentDTO createStudentDTO);
}
