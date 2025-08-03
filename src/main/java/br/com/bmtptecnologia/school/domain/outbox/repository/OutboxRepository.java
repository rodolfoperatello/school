package br.com.bmtptecnologia.school.domain.outbox.repository;

import br.com.bmtptecnologia.school.domain.outbox.OutboxEntity;

public interface OutboxRepository {
    void save(OutboxEntity outboxEntity);
}
