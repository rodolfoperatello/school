package br.com.bmtptecnologia.school.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bmtptecnologia.school.domain.student.CreateStudentUseCase;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

   @Autowired
   private final CreateStudentUseCase createStudentUseCase;

   public StudentController(CreateStudentUseCase createStudentUseCase) {
      this.createStudentUseCase = createStudentUseCase;
   }

   public ResponseEntity<?> create() {
      try {

         this.createStudentUseCase.execute();

         return ResponseEntity.status(HttpStatus.CREATED).build();
      } catch (final Exception e) {

         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }

   }
}
