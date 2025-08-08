package br.com.bmtptecnologia.school.domain.student.repository;

import br.com.bmtptecnologia.school.domain.student.StudentEntity;

public interface StudentRepository {
   StudentEntity save(StudentEntity studentEntity);
}
