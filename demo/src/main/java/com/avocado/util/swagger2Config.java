package com.avocado.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swagger2Config {

    @Bean
    public Docket buildDocket() {
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//调用下面apiInfo()方法
                .select()
                //Controller所在路径
                .apis(RequestHandlerSelectors.basePackage("com.avocado.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    public ApiInfo apiInfo() {
        return  new ApiInfoBuilder()
                .title("Avocado API")
                .description("这是一个swagger2小型demo")
                .termsOfServiceUrl("www.baidu.com")
                .version("0.0.1")
                .build();

    }
}
