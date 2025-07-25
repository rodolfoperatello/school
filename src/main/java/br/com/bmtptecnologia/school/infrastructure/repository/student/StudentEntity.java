package br.com.bmtptecnologia.school.infrastructure.repository.student;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.bmtptecnologia.school.infrastructure.repository.address.AddressEntity;

public class StudentEntity {
   private Long id;
   private Long addressId;
   private String name;
   private String lastName;
   private String phone;
   private LocalDate birthday;
   private LocalDateTime createdAt;
   private LocalDateTime updatedAt;
}
