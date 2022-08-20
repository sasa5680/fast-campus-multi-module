package dev.backend.module_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = { "dev.backend.module_api", "dev.backend.module_common"}
)
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
