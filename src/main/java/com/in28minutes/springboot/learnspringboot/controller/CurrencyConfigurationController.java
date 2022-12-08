package com.in28minutes.springboot.learnspringboot.controller;

import com.in28minutes.springboot.learnspringboot.configuration.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

  private final CurrencyServiceConfiguration configuration;

  @Autowired
  public CurrencyConfigurationController(
      final CurrencyServiceConfiguration configuration) {
    this.configuration = configuration;
  }

  @RequestMapping("/currency-configuration")
  public CurrencyServiceConfiguration retrieveConfiguration() {
    return configuration;
  }

}
