package br.com.bmtptecnologia.school.domain.address.usecase;

import java.util.Objects;

import br.com.bmtptecnologia.school.application.dto.CreateAddressDTO;
import br.com.bmtptecnologia.school.domain.address.AddressEntity;
import br.com.bmtptecnologia.school.domain.address.factory.AddressFactory;
import br.com.bmtptecnologia.school.domain.address.vo.CreateAddressVO;
import br.com.bmtptecnologia.school.domain.exception.CouldNotCreateAddressException;

public class CreateAddressUseCaseImpl implements CreateAddressUseCase {
   private final AddressFactory addressFactory;

   public CreateAddressUseCaseImpl(AddressFactory addressFactory) {
      this.addressFactory = addressFactory;
   }

   @Override
   public AddressEntity execute(CreateAddressDTO createAddressDTO) {
      CreateAddressVO createAddressVO = this.fromDTOtoVO(createAddressDTO);

      AddressEntity addressEntity = this.addressFactory.create(createAddressVO);
      if (Objects.isNull(addressEntity)) {
         throw new CouldNotCreateAddressException("status=address-cannot-be-null");
      }

      return addressEntity;
   }

   private CreateAddressVO fromDTOtoVO (CreateAddressDTO createAddressDTO) {
      return new CreateAddressVO(
          createAddressDTO.getStreet(),
          createAddressDTO.getNumber(),
          createAddressDTO.getNeighborhood(),
          createAddressDTO.getCity(),
          createAddressDTO.getState()
      );
   }
}
