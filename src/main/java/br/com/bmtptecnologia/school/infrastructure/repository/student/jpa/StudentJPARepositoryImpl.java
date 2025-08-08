package br.com.bmtptecnologia.school.infrastructure.repository.student.jpa;

import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import br.com.bmtptecnologia.school.domain.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentJPARepositoryImpl implements StudentRepository {

   private final StudentJPARepository studentJPARepository;

   @Autowired
   public StudentJPARepositoryImpl(StudentJPARepository studentJPARepository) {
      this.studentJPARepository = studentJPARepository;
   }

   @Override
   public StudentEntity save(StudentEntity studentEntity) {
      return studentJPARepository.save(studentEntity);
   }
}
