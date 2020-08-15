package br.com.codenation.security;


import br.com.codenation.challenge.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@EnableWebSecurity
@EnableAuthorizationServer
@EnableResourceServer
public class SegurancaDoOAUTH
        extends WebSecurityConfigurerAdapter {

    @Autowired private UserDetailsService challService;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean()
            throws Exception{
        return super.authenticationManagerBean();
    }
    /*public void configure(AuthorizationServerSecurityConfigurer secuConfig) throws Exception{
        secuConfig.tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()")
                .allowFormAuthenticationForClients();
    }*/

    @Override
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers(HttpMethod.POST,
                "/challenge/",
                "/acceleration/");
        /*web.ignoring().antMatchers("/v2/api-docs",
                "/configuration/ui",
                "/swagger-resources/**",
                "/configuration/security",
                "/swagger-ui.html",
                "/webjars/**");*/

    }


    /*@Override
    public  void configure(HttpSecurity httpSecurity) throws Exception{
        System.out.println("Chamou HttpSecurity");
        httpSecurity.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/challenge")
                .permitAll().anyRequest().permitAll()


        ;
    }*/

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }



    @Override
    public void configure(AuthenticationManagerBuilder autBuilder)
        throws Exception{
        autBuilder.userDetailsService(challService)
                .passwordEncoder(passwordEncoder());
    }




}
