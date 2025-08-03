package br.com.bmtptecnologia.school.domain.student.usecase;

import br.com.bmtptecnologia.school.application.dto.CreateStudentDTO;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.vo.CreateStudentVO;

public interface CreateStudentUseCase {
   StudentEntity execute(CreateStudentVO createStudentVO);
}
