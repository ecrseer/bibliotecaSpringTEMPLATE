package br.com.codenation.security.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceRecursosOAUT
        extends ResourceServerConfigurerAdapter {

    @Autowired
    public void configureGlobal(final AuthenticationManagerBuilder ambuilder){
        ambuilder.authenticationProvider(authProvider());
    }
}
