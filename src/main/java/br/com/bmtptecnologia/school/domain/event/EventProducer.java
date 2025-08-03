package br.com.bmtptecnologia.school.domain.event;

public interface EventProducer {
    void send(byte[] message);
    String eventDestination();
}
