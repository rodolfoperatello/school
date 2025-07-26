package br.com.bmtptecnologia.school.domain.address.vo;

import br.com.bmtptecnologia.school.domain.address.AddressEntity;

public class CreateAddressVO {
   private final String street;
   private final String number;
   private final String neighborhood;
   private final String city;
   private final String state;

   public CreateAddressVO(String street, String number, String neighborhood, String city, String state) {
      this.street = street;
      this.number = number;
      this.neighborhood = neighborhood;
      this.city = city;
      this.state = state;
   }

   public String getStreet() {
      return street;
   }

   public String getNumber() {
      return number;
   }

   public String getNeighborhood() {
      return neighborhood;
   }

   public String getCity() {
      return city;
   }

   public String getState() {
      return state;
   }
}
