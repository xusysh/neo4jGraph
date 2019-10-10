package com.graphdatabase;

import com.graphdatabase.service.PersonNeo4jService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GraphApplicationTests {
	@Autowired
	PersonNeo4jService neo4jService;

	@Test
	public void contextLoads() {

//
//			int i = 0;
//			do {
//				UserNode user = new UserNode();
//				user.setAge(RandomUtils.nextInt(15, 40));
//				user.setName("Fredia" + RandomUtils.nextInt(1, 1000));
//				user.setUserId(UUID.randomUUID().toString());
//				user.setNodeId(RandomUtils.nextLong(1L, 999L));
//				neo4jService.addUser(user);
//				i += 1;
//			} while (i < 400);
//
//		List<UserNode> userNodes=neo4jService.getUserNodeList();
//		System.out.print(userNodes);

	}

}
