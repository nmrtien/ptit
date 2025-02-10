package ptit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Cho phép tất cả các domain
        registry.addMapping("/**")
            .allowedOrigins("*")  // Cho phép tất cả các domain
            .allowedMethods("GET", "POST", "PUT", "DELETE")  // Các phương thức HTTP cho phép
            .allowedHeaders("*")  // Các header cho phép
            .allowCredentials(false);  // Cho phép cookie và credentials
    }
}
