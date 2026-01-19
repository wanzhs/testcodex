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

## HTTP file test

You can use the HTTP file in `http/hello.http` with IDE HTTP clients (for example,
IntelliJ IDEA or VS Code REST Client). Start the app, then execute the requests
in the file to verify the JSON response.

## Example

```
GET http://localhost:8080/?name=Codex
```

Response:

```json
{"message":"Hello, Codex!","timestamp":"2024-01-01T12:00:00Z"}
```