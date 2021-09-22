package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public abstract class Animal {
    @Autowired
    Animal animal;

}
