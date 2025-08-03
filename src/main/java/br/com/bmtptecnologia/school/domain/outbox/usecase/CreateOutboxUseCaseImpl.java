package br.com.bmtptecnologia.school.domain.outbox.usecase;

import br.com.bmtptecnologia.school.domain.outbox.factory.OutboxFactory;
import br.com.bmtptecnologia.school.domain.outbox.OutboxEntity;
import br.com.bmtptecnologia.school.domain.outbox.vo.OutboxVO;

public class CreateOutboxUseCaseImpl implements CreateOutboxUseCase {
    private final OutboxFactory outboxFactory;

    public CreateOutboxUseCaseImpl(OutboxFactory outboxFactory) {
        this.outboxFactory = outboxFactory;
    }

    @Override
    public OutboxEntity execute(OutboxVO outboxVO) {

        OutboxEntity outboxEntity = this.outboxFactory.create(null);

        return outboxEntity;

    }
}
