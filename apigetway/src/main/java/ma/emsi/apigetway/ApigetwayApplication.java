package ma.emsi.apigetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@SpringBootApplication
public class ApigetwayApplication {

    @Bean
    RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/api/client/**").uri("lb://CLIENT-SERVICE"))
                .route(r->r.path("/api/car/**").uri("lb://VOITURE-SERVICE"))
                .build();
    }

    /*@Bean
    DiscoveryClientRouteDefinitionLocator routesDynamic(
            ReactiveDiscoveryClient reactiveDiscoveryClient,
            DiscoveryLocatorProperties discoveryLocatorProperties){
        return new DiscoveryClientRouteDefinitionLocator(reactiveDiscoveryClient,discoveryLocatorProperties);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ApigetwayApplication.class, args);
    }

}
