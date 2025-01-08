package ma.ensa.gateway_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
public class SecurityConfig {

    // @Bean
    // public SecurityFilterChain customSecurityFilterChain(HttpSecurity http) throws Exception {
    //     return http.csrf(AbstractHttpConfigurer::disable)
    //             // .authorizeRequests(authorizeRequests ->
    //             //         authorizeRequests
    //             //                 .antMatchers("/**/*.html", "/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg", "/**/*.gif", "/**/*.ico").permitAll() // Allow static files
    //             //                 .anyRequest().authenticated() // Protect other endpoints
    //             // )
    //             .authorizeHttpRequests(
    //                 req -> req.requestMatchers("/**/*.html", "/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg", "/**/*.gif", "/**/*.ico").permitAll()
    //                         // .requestMatchers("/api/admin/**").hasAnyAuthority("ADMIN")
    //                         .anyRequest().authenticated()
    //         )
    //             .build();
    // }
}
