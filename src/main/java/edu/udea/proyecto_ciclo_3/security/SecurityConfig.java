package edu.udea.proyecto_ciclo_3.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasRole;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    SuccesGoogle succesGoogle;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    public PasswordEncoder getPassowrdEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/usuario/front/**").hasRole("ADMIN")
                .antMatchers("/user").hasAnyRole("ADMIN","USER")
                .antMatchers("/").permitAll()
                .antMatchers("/login*").permitAll()
                .antMatchers("/oauth/**").permitAll()

                .and()

                .formLogin()
                .loginPage("/login")
                .usernameParameter("nombreUsuario")
                .passwordParameter("password")
                .defaultSuccessUrl("/welcome")

                .and()

                .oauth2Login()
                .loginPage("/login")
                .successHandler(succesGoogle)

                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
        ;

        http.csrf().disable();

    }

}