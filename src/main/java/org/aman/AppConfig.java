package org.aman;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // signifies that this is a configuration class
@ComponentScan("org.aman") // performs component scan in the specified package
public class AppConfig {
}
