package com.davidherron.pvmodulesinverters.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.davidherron.pvmodulesinverters.model.Inverter;
import com.davidherron.pvmodulesinverters.model.Module;
import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerConfig {

	  @Autowired
	  private TypeResolver typeResolver;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.any())
               .paths(PathSelectors.regex("/modules.*|/inverters.*"))
               // .PathSelectors.any() // for all
               .build().apiInfo(apiInfo())
               .additionalModels(typeResolver.resolve(Module.class))
               .additionalModels(typeResolver.resolve(Inverter.class));
    }

    private ApiInfo apiInfo() {
        @SuppressWarnings("deprecation")
        ApiInfo apiInfo = new ApiInfo(
                "PV Modules and Inverters",
                "Microservice for querying a Module and Inverter database from GoSolarCalifornia",
                "1.0",
                "https://... URL for the Terms and Services",
                "David Herron <david@davidherron.com>",
                "a License of API",
                "https://... URL for the license");
        return apiInfo;
    }
}
