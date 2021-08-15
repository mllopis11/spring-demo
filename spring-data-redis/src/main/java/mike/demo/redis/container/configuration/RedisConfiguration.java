package mike.demo.redis.container.configuration;

import java.time.Duration;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
class RedisConfiguration {

    @Value("${redis.host:localhost}")
    private String host;

    @Value("${redis.port:6379}")
    private int port;

    @Value("${redis.database:0}")
    private int database;

    @Value("${redis.password}")
    @NotBlank
    private String password;
    
    @Value("${redis.timeout:10000}")
    private int timeout;
    
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        var redisStandaloneConfiguration = new RedisStandaloneConfiguration(host, port);
        redisStandaloneConfiguration.setDatabase(database);
        redisStandaloneConfiguration.setPassword(RedisPassword.of(password));

        LettuceClientConfiguration clientClientConfiguration = 
                LettuceClientConfiguration.builder().commandTimeout(Duration.ofSeconds(timeout)).build();
        
        return new LettuceConnectionFactory(redisStandaloneConfiguration, clientClientConfiguration);
    }
    
    @Bean
    public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
}
