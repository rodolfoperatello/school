package br.com.bmtptecnologia.school.domain.student.factory;

import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.vo.CreateStudentVO;

public interface CreateStudentFactory {
   StudentEntity execute(CreateStudentVO createStudentVO);
}
