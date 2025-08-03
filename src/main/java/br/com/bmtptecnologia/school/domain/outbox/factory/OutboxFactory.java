package br.com.bmtptecnologia.school.domain.outbox.factory;

import br.com.bmtptecnologia.school.domain.outbox.vo.OutboxVO;
import br.com.bmtptecnologia.school.domain.outbox.OutboxEntity;

public interface OutboxFactory {
    OutboxEntity create(OutboxVO OutboxVO);
}
