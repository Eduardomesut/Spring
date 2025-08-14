package org.example.filminapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private static final String API_VERSION = "1.0";
    private static final String API_TITLE = "FilminApi";
    private static final String API_DESCRIPTION = "API de Peliculas";
    private static final String API_TERMS_OF_SERVICE_URL = "https://github.com/EduardoMerinoFernand/FilminApi";
    private static final String API_CONTACT_NAME = "<NAME>";
    private static final String API_CONTACT_URL = "https://github.com/EduardoMerinoFernand";
    private static final String API_CONTACT_EMAIL = "<EMAIL>";
    private static final String API_LICENSE = "Apache 2.0";
    private static final String API_LICENSE_URL = "https://www.apache.org/licenses/LICENSE-2.0";

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)
                        .description(API_DESCRIPTION)
                        .version(API_VERSION)
                        .termsOfService(API_TERMS_OF_SERVICE_URL)
                        .contact(new Contact()
                                .name(API_CONTACT_NAME)
                                .url(API_CONTACT_URL)
                                .email(API_CONTACT_EMAIL))
                        .license(new License()
                                .name(API_LICENSE)
                                .url(API_LICENSE_URL)));
    }
}
