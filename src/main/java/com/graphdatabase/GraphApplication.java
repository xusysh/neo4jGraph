package com.graphdatabase;

import org.mybatis.spring.annotation.MapperScan;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

//@EnableNeo4jRepositories
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.graphdatabase.dao")
@SpringBootApplication
public class GraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphApplication.class, args);
	}


	@Value("${blotUri}")
	private String uri;

	@Value("${spring.data.neo4j.username}")
	private String username;

	@Value("${spring.data.neo4j.password}")
	private String password;

	@Bean
	public Driver neo4jDriver() {
		return GraphDatabase.driver(uri, AuthTokens.basic(username,password));
	}

}
