package br.com.bmtptecnologia.school.domain.student.vo;

import java.time.LocalDate;

public class CreateStudentVO {
   private final String name;
   private final String lastName;
   private final String phone;
   private final LocalDate birthday;

   public CreateStudentVO(String name, String lastName, String phone, LocalDate birthday) {
      this.name = name;
      this.lastName = lastName;
      this.phone = phone;
      this.birthday = birthday;
   }

   public String getName() {
      return name;
   }

   public String getLastName() {
      return lastName;
   }

   public String getPhone() {
      return phone;
   }

   public LocalDate getBirthday() {
      return birthday;
   }
}
