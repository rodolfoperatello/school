package br.com.bmtptecnologia.school.infrastructure.repository.student.jpa;

import br.com.bmtptecnologia.school.domain.student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJPARepository extends JpaRepository<StudentEntity, Long> {
}
