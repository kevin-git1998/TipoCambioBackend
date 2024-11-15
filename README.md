# TipoCambioBackend

Este es el backend de una aplicación para gestionar solicitudes de tipo de cambio. El proyecto está desarrollado con **Spring Boot** y **Java 17**.

## Requisitos

- Java 17 o superior
- MySQL 8 o superior
- Maven 3.6 o superior

## Instalación y Ejecución

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/usuario/TipoCambioBackend.git
   cd TipoCambioBackend

Configurar la base de datos:

Crea una base de datos en MySQL:

sql

CREATE DATABASE tipo_cambio_db;

Configura los detalles de la base de datos en el archivo src/main/resources/application.

properties:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/tipo_cambio_db

spring.datasource.username=root

spring.datasource.password=yourpassword

Instalar dependencias y compilar el proyecto:


./mvnw clean install

Ejecutar la aplicación:


./mvnw spring-boot:run

La aplicación estará disponible en http://localhost:8080.