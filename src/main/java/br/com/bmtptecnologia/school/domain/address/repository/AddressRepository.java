package br.com.bmtptecnologia.school.domain.address.repository;

import br.com.bmtptecnologia.school.domain.address.AddressEntity;

public interface AddressRepository {
   Long create(AddressEntity addressEntity);
}
