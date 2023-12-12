package com.vn.edu.iuh.fit.onckspring.backend.configs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class config {
    @Autowired
    public void globalConfig(AuthenticationManagerBuilder auth, PasswordEncoder
            encoder)throws Exception{
        auth.inMemoryAuthentication()
                .withUser(User.withUsername("admin")
                        .password(encoder.encode("admin123"))
                        .roles("ADMIN")
                        .build())
                .withUser(User.withUsername("user")
                        .password(encoder.encode("user123"))
                        .roles("USER")
                        .build())
        ;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(auth->auth
//                .requestMatchers("/my-home", "/danhSachSanPham").permitAll()
//                .requestMatchers("/quanLySanPham","deleteProduct", "updateProduct", "addNewProduct", "/admin/**").hasRole("ADMIN")
//                .anyRequest().permitAll()
        http.authorizeHttpRequests(auth->auth
                .requestMatchers("/","/my-home", "/danhSachSanPham").permitAll()
                .requestMatchers("/quanLySanPham","deleteProduct", "updateProduct", "addNewProduct", "/admin/**").hasAnyRole("ADMIN")
                .anyRequest().authenticated()

        );
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
