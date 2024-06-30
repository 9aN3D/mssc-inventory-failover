package guru.springframework.mssc.inventory.failover.configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@EnableDiscoveryClient
@Configuration
public class LocalDiscoveryConfiguration {

}
