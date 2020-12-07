package com.example.bellerophon.controller.hello;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandler { //обработчик для обработки запроса и создания ответа

    public Mono<ServerResponse> hello(ServerRequest request) {
        //это простой реактивный класс, который возвращает String "Всем привет!".
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("Hello, Spring!"));
    }
}
