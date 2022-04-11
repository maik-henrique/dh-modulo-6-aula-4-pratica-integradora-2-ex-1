package br.com.meli.demo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "br.com.meli.elasticsearch.elasticrepositories")
public class ElasticSearchConfig {
    @Value("${elastic.search.address}")
    private String elasticSearchAddress;

    @Bean
    public RestHighLevelClient client() {
        ClientConfiguration clientConfig = ClientConfiguration.builder()
                .connectedTo(elasticSearchAddress)
                .build();
        return RestClients.create(clientConfig).rest();
    }


    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchRestTemplate(client());
    }
}
