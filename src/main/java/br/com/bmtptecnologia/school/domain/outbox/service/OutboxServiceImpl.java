package br.com.bmtptecnologia.school.domain.outbox.service;

import br.com.bmtptecnologia.school.domain.outbox.repository.OutboxRepository;

public class OutboxServiceImpl implements OutboxService {
    private final OutboxRepository outboxRepository;

    public OutboxServiceImpl(OutboxRepository outboxRepository) {
        this.outboxRepository = outboxRepository;
    }

    @Override
    public void saveEvent() {
        this.outboxRepository.save();
    }
}
