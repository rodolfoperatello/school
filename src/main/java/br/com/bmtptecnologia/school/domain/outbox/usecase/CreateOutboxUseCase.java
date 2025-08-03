package br.com.bmtptecnologia.school.domain.outbox.usecase;

import br.com.bmtptecnologia.school.domain.outbox.OutboxEntity;
import br.com.bmtptecnologia.school.domain.outbox.vo.OutboxVO;

public interface CreateOutboxUseCase {
    OutboxEntity execute(OutboxVO outboxVO);
}
