package mike.demo.redis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import mike.bootstrap.springboot.application.Application;

@SpringBootApplication
@ComponentScan(basePackages = { Application.BOOT_BASE_PACKAGE, "mike.demo.redis"})
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Data Redis Sample",
                description = "Spring Data Redis implementation",
                version = "1.0")
)
public class DemoRedisApplication {

    public static void main(String[] args) {
        Application.servlet(DemoRedisApplication.class, args);
    }

}
