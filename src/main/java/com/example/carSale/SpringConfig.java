package com.example.carSale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.carSale")
public class SpringConfig {

    @Bean
    public ClassicConfiguration classicConfiguration() {
        return new ClassicConfiguration();
    }

    @Bean
    public SportConfiguration sportConfiguration() {
        return new SportConfiguration();
    }

    @Bean
    public LuxConfiguration luxConfiguration() {
        return new LuxConfiguration();
    }

    @Bean PremiumConfiguration premiumConfiguration() {
        return new PremiumConfiguration();
    }

    @Bean
    public Car classicCar() {
        return new Car(classicConfiguration());
    }

    @Bean
    public Car sportCar() {
        return new Car(sportConfiguration());
    }

    @Bean
    public Car luxCar() {
        return new Car(luxConfiguration());
    }

    @Bean Car premiumCar() {
        return new Car(premiumConfiguration());
    }
}
