package br.com.bmtptecnologia.school.domain.address.factory;

import br.com.bmtptecnologia.school.domain.address.vo.CreateAddressVO;
import br.com.bmtptecnologia.school.domain.address.AddressEntity;

public interface AddressFactory {
   AddressEntity create(CreateAddressVO createAddressVO);
}
