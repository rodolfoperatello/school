package br.com.bmtptecnologia.school.domain.outbox;

public class OutboxEntity {
    private MessageBroker messageBroker;
    private String event;

    public OutboxEntity(MessageBroker messageBroker, String event) {
        this.messageBroker = messageBroker;
        this.event = event;
    }

    public MessageBroker getMessageBroker() {
        return messageBroker;
    }

    public void setMessageBroker(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
