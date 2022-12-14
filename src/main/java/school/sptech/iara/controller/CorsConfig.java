package school.sptech.iara.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://44.211.104.89:3000/")
                .allowedMethods("GET", "POST", "DELETE", "OPTIONS", "HEAD", "TRACE", "PATCH", "CONNECT");
    }

}
