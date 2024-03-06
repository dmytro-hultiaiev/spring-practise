package springBase;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springBase")
@PropertySource("classpath:myProperties.properties")
public class MyConfiguration {
}
