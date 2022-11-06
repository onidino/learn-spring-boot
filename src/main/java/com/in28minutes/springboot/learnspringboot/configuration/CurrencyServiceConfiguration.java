package com.in28minutes.springboot.learnspringboot.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfiguration {

  private String url;
  private String username;
  private String key;

}
