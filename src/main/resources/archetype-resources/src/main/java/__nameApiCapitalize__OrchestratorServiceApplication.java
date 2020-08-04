#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ${nameApiCapitalize}OrchestratorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(${nameApiCapitalize}OrchestratorServiceApplication.class, args);
    }

}
