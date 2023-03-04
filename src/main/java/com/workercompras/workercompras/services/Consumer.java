package com.workercompras.workercompras.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workercompras.workercompras.model.Pedido;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.io.IOException;


@Service
public class Consumer {

    @Autowired
    private ObjectMapper objectMapper;

    @RabbitListener(queues = {"${queue.name}"})
    public void capturarPedido(@Payload Message message) throws IOException {
        var pedido = objectMapper.readValue(message.getBody(), Pedido.class);
        System.out.println("Pedido capturado NOME:" + pedido.getNome()+ " ID: " + pedido.getId());
    }

}
