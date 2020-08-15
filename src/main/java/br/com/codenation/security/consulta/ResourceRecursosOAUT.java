package br.com.codenation.security.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import java.security.AuthProvider;

@Configuration
@EnableResourceServer
public class ResourceRecursosOAUT
        extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        System.out.println("ADMIN: Liberando a baderna");
        http.authorizeRequests()
        /*.antMatchers(HttpMethod.GET,"/challenge/").authenticated()*/
        .antMatchers(HttpMethod.POST,"/challenge").permitAll()
        ;
        //super.configure(http);
    }
}
