package br.com.bmtptecnologia.school.domain.event;

public interface EventConsumer {
    void consume(byte[] event);
}
