package br.com.codenation.challenge.security.consulta;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceRecursosOAUT
        extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        System.out.println("ADMIN: Liberando a baderna");
        http
        .authorizeRequests()
        .antMatchers(HttpMethod.POST,"/challenge")
        .permitAll()
        .anyRequest()
        .hasRole("ADMIN")
        ;


        /*.antMatchers(HttpMethod.GET,"/challenge/").authenticated()*/
        //super.configure(http);
    }

}
