package com.example.demo;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public Map<String, Object> hello(@RequestParam(defaultValue = "World") String name) {
    Map<String, Object> response = new LinkedHashMap<>();
    response.put("message", String.format("Hello, %s!", name));
    response.put("timestamp", Instant.now().toString());
    return response;
  }
}
