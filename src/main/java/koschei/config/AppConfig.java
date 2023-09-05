package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.Ocean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public KoscheiTheDeathless koscheiTheDeathless(Ocean1 ocean1) {
        return new KoscheiTheDeathless();
    }

}
