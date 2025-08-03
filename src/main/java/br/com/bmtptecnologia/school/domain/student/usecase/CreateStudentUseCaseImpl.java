package br.com.bmtptecnologia.school.domain.student.usecase;

import br.com.bmtptecnologia.school.application.dto.CreateStudentDTO;
import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.factory.CreateStudentFactory;
import br.com.bmtptecnologia.school.domain.student.vo.CreateStudentVO;

public class CreateStudentUseCaseImpl implements CreateStudentUseCase {
   private final CreateStudentFactory createStudentFactory;

   public CreateStudentUseCaseImpl(CreateStudentFactory createStudentFactory) {
      this.createStudentFactory = createStudentFactory;
   }

   @Override
   public StudentEntity execute(CreateStudentVO createStudentVO) {
      StudentEntity studentEntity = this.createStudentFactory.execute(createStudentVO);

      // add validações
      return studentEntity;
   }
}
