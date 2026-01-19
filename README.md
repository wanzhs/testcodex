# Spring Boot Demo

This is a test repo for OpenAI Codex integration.

A minimal Spring Boot demo app with a JSON greeting endpoint.

## Requirements

- Java 17+
- Maven 3.9+

## Run

```bash
mvn spring-boot:run
```

## Build & Test

```bash
mvn clean verify
```

## Example

```
GET http://localhost:8080/?name=Codex
```

Response:

```json
{"message":"Hello, Codex!","timestamp":"2024-01-01T12:00:00Z"}
```
