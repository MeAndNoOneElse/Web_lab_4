package config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import ru.weblab4.filters.CorsFilter;
import ru.weblab4.filters.JwtFilter;
import ru.weblab4.resources.AuthResource;
import ru.weblab4.resources.ResultResource;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // регистрируем ресурсы и фильтры
        register(AuthResource.class);
        register(ResultResource.class);
        register(JwtFilter.class);
        register(CorsFilter.class);
        // ...existing code...
    }
}
