package br.com.codenation.challenge.swags;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class swaggerConfig {

    public Docket apis(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("br.com.codenation.Transporte.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(informacaoInfo())
                .useDefaultResponseMessages(false)

                ;
    }

    private ApiInfo informacaoInfo(){
        return new ApiInfo(
        "Nome",
        "Descricao",
        "","",
        null,"",""

        ,new ArrayList<>());


    }
}
