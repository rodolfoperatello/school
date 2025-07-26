package br.com.bmtptecnologia.school.domain.exception;

public class CouldNotCreateAddressException extends RuntimeException {
   public CouldNotCreateAddressException(String message){
      super(message);
   }
}
