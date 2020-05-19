package com.microservices.limitsservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("limits-service")
class Configuration(){

    var maximum: Int? = null
    var minimum: Int? = null
}