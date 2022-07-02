package com.fastcampus.springwebflux

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class HelloRouter(
    private val handler: HelloHandler,
) {

    @Bean
    fun router() = router {
        GET("/", handler::sayHello)
    }
}