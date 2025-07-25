package br.com.bmtptecnologia.school.domain.student;

import java.time.LocalDate;

public class Student {
   private String name;
   private String lastName;
   private String phone;
   private LocalDate birthday;

   public Student(String name, String lastName, String phone, LocalDate birthday) {
      this.name = name;
      this.lastName = lastName;
      this.phone = phone;
      this.birthday = birthday;
   }

   public String getName() {
      return this.name;
   }

   public String lastName() {
      return this.lastName;
   }

   public String getPhone() {
      return this.phone;
   }

   public LocalDate getBirthday() {
      return this.birthday;
   }
}
