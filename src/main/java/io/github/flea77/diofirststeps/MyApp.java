package io.github.flea77.diofirststeps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Result: " + calculator.add(2, 7));
    }
}
