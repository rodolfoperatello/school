package br.com.bmtptecnologia.school.domain.address.usecase;

import br.com.bmtptecnologia.school.application.dto.CreateAddressDTO;
import br.com.bmtptecnologia.school.domain.address.vo.CreateAddressVO;
import br.com.bmtptecnologia.school.domain.address.AddressEntity;

public interface CreateAddressUseCase {
   AddressEntity execute(CreateAddressVO createAddressVO);
}
