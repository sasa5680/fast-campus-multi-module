package dev.backend.module_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication(
        scanBasePackages = { "dev.backend.module_api", "dev.backend.module_common"}
)
@EntityScan("dev.backend.module_common.domain") //엔티티를 스캔한다.
@EnableJpaRepositories(basePackages = "dev.backend.module_common.repo") //레포지토리를 스캔한다.
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
