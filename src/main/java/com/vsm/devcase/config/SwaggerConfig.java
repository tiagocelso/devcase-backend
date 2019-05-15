package com.vsm.devcase.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 *
 * @author tiago.faria
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket configDocumentationApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.vsm.devcase"))
                .build() 
                .apiInfo(metaData());

    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Api")
                .description("Api Documentação")
                .version("1.0")
                .license("Apache License Version 2.0")
                .licenseUrl("www.vsm.com.br")
                .contact(contato())
                .build();
    }

    private Contact contato() {
        return new Contact(
                "Tiago Celso Faria",
                "https://github.com/tiagocelso",
                "tiagocelso10@gmail.com");
    }
}
