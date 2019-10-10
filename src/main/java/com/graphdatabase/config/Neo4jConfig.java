package com.graphdatabase.config;

/**
 * Created by twinkleStar on 2019/10/10.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories(basePackages = "com.graphdatabase.repository")
//@EnableTransactionManagement // 激活SDN隐式事务
public class Neo4jConfig {
}
