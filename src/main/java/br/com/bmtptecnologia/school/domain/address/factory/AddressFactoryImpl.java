package br.com.bmtptecnologia.school.domain.address.factory;

import br.com.bmtptecnologia.school.domain.address.vo.CreateAddressVO;
import br.com.bmtptecnologia.school.domain.address.AddressEntity;

public class AddressFactoryImpl implements AddressFactory {

   @Override
   public AddressEntity create(CreateAddressVO createAddressVO) {
      return new AddressEntity(
          createAddressVO.getStreet(),
          createAddressVO.getNumber(),
          createAddressVO.getNeighborhood(),
          createAddressVO.getCity(),
          createAddressVO.getState()
      );
   }
}
