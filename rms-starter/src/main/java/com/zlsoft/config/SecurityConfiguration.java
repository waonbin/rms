package com.zlsoft.config;

import com.zlsoft.security.handler.AjaxAuthenticationFailureHandler;
import com.zlsoft.security.handler.AjaxAuthenticationSuccessHandler;
import com.zlsoft.security.handler.AjaxLogoutSuccessHandler;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.zalando.problem.spring.web.advice.security.SecurityProblemSupport;

import javax.annotation.PostConstruct;

@Configuration
@Import(SecurityProblemSupport.class)
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    private final UserDetailsService userDetailsService;

    private final SecurityProblemSupport problemSupport;

    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder, UserDetailsService userDetailsService,
                                 SecurityProblemSupport problemSupport) {
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.userDetailsService = userDetailsService;
        this.problemSupport = problemSupport;
    }

    @PostConstruct
    public void init() {
        try {
            authenticationManagerBuilder
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
        } catch (Exception e) {
            throw new BeanInitializationException("Security configuration failed", e);
        }
    }

    @Bean
    public AjaxAuthenticationSuccessHandler ajaxAuthenticationSuccessHandler() {
        return new AjaxAuthenticationSuccessHandler();
    }

    @Bean
    public AjaxAuthenticationFailureHandler ajaxAuthenticationFailureHandler() {
        return new AjaxAuthenticationFailureHandler();
    }

    @Bean
    public AjaxLogoutSuccessHandler ajaxLogoutSuccessHandler() {
        return new AjaxLogoutSuccessHandler();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
//        web.ignoring()
//            .antMatchers(HttpMethod.OPTIONS, "/**")
//            .antMatchers("/app/**/*.{js,html}")
//            .antMatchers("/i18n/**")
//            .antMatchers("/content/**")
//            .antMatchers("/swagger-ui/index.html")
//            .antMatchers("/test/**")
//            .antMatchers("/h2-console/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            // temporary disable csrf
            // please refer to:
            //    https://blog.csdn.net/sinat_28454173/article/details/52251004
            //    https://stackoverflow.com/questions/23477344/put-csrf-into-headers-in-spring-4-0-3-spring-security-3-2-3-thymeleaf-2-1-2
            .csrf().disable()
//            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//        .and()
//            .addFilterBefore(corsFilter, CsrfFilter.class)
//            .exceptionHandling()
//            .authenticationEntryPoint(problemSupport)
//            .accessDeniedHandler(problemSupport)
//        .and()
//            .rememberMe()
//            .rememberMeServices(rememberMeServices)
//            .rememberMeParameter("remember-me")
//            .key(jHipsterProperties.getSecurity().getRememberMe().getKey())
//        .and()
            .formLogin()
                .loginPage("/member/login")
            .loginProcessingUrl("/j_spring_security_check")
            .successHandler(ajaxAuthenticationSuccessHandler())
            .failureHandler(ajaxAuthenticationFailureHandler())
            .usernameParameter("j_username")
            .passwordParameter("j_password")
            .permitAll()
//        .and()
//            .logout()
//            .logoutUrl("/s/logout")
//            .logoutSuccessHandler(ajaxLogoutSuccessHandler())
//            .permitAll()
//        .and()
//            .headers()
//            .frameOptions()
//            .disable()
        .and()
            .authorizeRequests()
            .antMatchers("/j_spring_security_check").permitAll()
//            .antMatchers("/api/register").permitAll()
//            .antMatchers("/api/activate").permitAll()
//            .antMatchers("/api/authenticate").permitAll()
//            .antMatchers("/api/account/reset-password/init").permitAll()
//            .antMatchers("/api/account/reset-password/finish").permitAll()
//            .antMatchers("/api/profile-info").permitAll()
//            .antMatchers("/api/**").authenticated()
//            .antMatchers("/management/health").permitAll()
//            .antMatchers("/management/**").hasAuthority(AuthoritiesConstants.ADMIN)
//            .antMatchers("/v2/api-docs/**").permitAll()
//            .antMatchers("/swagger-resources/configuration/ui").permitAll()
//            .antMatchers("/swagger-ui/index.html").hasAuthority(AuthoritiesConstants.ADMIN)
        ;

    }

}
