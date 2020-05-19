package com.microservices.limitsservice.controller

import com.microservices.limitsservice.config.Configuration
import com.microservices.limitsservice.config.LimitConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LimitsConfigurationController(@Autowired val configuration: Configuration) {

    @GetMapping("/limits")
    fun retrieveLimitsFromConfigurations(): LimitConfiguration {
        return LimitConfiguration(configuration.maximum, configuration.minimum)
    }
}