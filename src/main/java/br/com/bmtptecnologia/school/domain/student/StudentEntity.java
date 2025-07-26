package br.com.bmtptecnologia.school.domain.student;

import java.time.LocalDate;
import java.util.Objects;

import br.com.bmtptecnologia.school.domain.exception.ChangeAddressException;

public class StudentEntity {
   private final String name;
   private final String lastName;
   private final String phone;
   private final LocalDate birthday;
   private Long addressId;

   public StudentEntity(String name, String lastName, String phone, LocalDate birthday) {
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

   public void changeAddress(Long addressId) {
      if (Objects.isNull(addressId)) {
         throw new ChangeAddressException(
             String.format("status=address-id-cannot-be-empty, studentName=%s, " +
                 "studentLastName=%s", this.name, this.lastName));
      }
      this.addressId = addressId;
   }
}
