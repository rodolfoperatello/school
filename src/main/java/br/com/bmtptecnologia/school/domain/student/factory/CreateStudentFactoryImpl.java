package br.com.bmtptecnologia.school.domain.student.factory;

import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.vo.CreateStudentVO;

public class CreateStudentFactoryImpl implements CreateStudentFactory {

   @Override
   public StudentEntity execute(CreateStudentVO createStudentVO) {
      StudentEntity studentEntity = new StudentEntity(
          createStudentVO.getName(),
          createStudentVO.getLastName(),
          createStudentVO.getPhone(),
          createStudentVO.getBirthday()
      );

      return studentEntity;
   }
}
