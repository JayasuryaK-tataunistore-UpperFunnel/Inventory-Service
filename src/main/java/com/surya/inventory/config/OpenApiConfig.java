package com.surya.inventory.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI productServiceAPI() {
        return new OpenAPI()
                .info(new Info().title("Inventory Service API")
                        .description("Inventory Service REST API documentation")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation().description("Testing External Docs")
                        .url("https://github.com/JayasuryaK-tataunistore-UpperFunnel/Elasticsearch-crud-test/blob/main/src/main/java/com/example/elasticsearchtest/config/ESClient.java"));
    }

}