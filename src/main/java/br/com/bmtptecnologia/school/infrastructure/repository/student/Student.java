package br.com.bmtptecnologia.school.infrastructure.repository.student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
   private Long id;
   private Long addressId;
   private String name;
   private String lastName;
   private String phone;
   private LocalDate birthday;
   private LocalDateTime createdAt;
   private LocalDateTime updatedAt;
}
