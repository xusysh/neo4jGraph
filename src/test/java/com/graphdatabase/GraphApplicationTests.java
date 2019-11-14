package com.graphdatabase;

import com.graphdatabase.repository.nodeRepository.CompanyRepository;
//import com.graphdatabase.repository.nodeRepository.StudentRepository;
import com.graphdatabase.service.StudentServiceImpl;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GraphApplicationTests {


//	@Autowired
//	private StudentRepository studentRepository;

	@Autowired
	private StudentServiceImpl neo4jService;

	@Autowired
	CompanyRepository companyRepository;

	/**
	 * 保存单个节点
	 */
//	@Test
//	public void saveStudentNode(){
//		StudentNode studentNode = new StudentNode();
//		studentNode.setName("张0");
//		studentRepository.save(studentNode);
//	}

	/**
	 * 通过name查询学生节点
	 */
//	@Test
//	public void findStudentNodeByName(){
//		StudentNode studentNode = studentRepository.findByName("张0");
//		System.out.println(studentNode);
//	}

	/**
	 * 保存批量节点
	 */
//	@Test
//	public void saveAllStudentNode(){
//		List<StudentNode> studentNodeList = new ArrayList<>();
//		StudentNode studentNode;
//		for(int i = 1; i <= 10; i++){
//			studentNode = new StudentNode();
//			studentNode.setName("张" + i);
//			studentNodeList.add(studentNode);
//		}
//		studentRepository.saveAll(studentNodeList);
//	}

	/**
	 * 查询全部
	 */
//	@Test
//	public void findAll(){
//		//iterable to list
//		List<StudentNode> studentNodeList = Lists.newArrayList(studentRepository.findAll());
//		System.out.println(studentNodeList);
//	}

	/**
	 * 分页查询
	 */
//	@Test
//	public void pageFindAll(){
//		List<CompanyToMember> p = companyRepository.findCompanyToMember();
//		System.out.println(p);
//	}

	/**
	 * 保存如下友谊关系
	 *
	 * 1 <-> 2 <-> 5 -> 9
	 *          -> 6
	 *    -> 3 <-> 7 -> 10
	 *    -> 4 <-> 8
	 */
//	@Test
//	public void saveFriendship(){
//		neo4jService.saveFriendship("张1","张2");
//		neo4jService.saveFriendship("张1","张3");
//		neo4jService.saveFriendship("张1","张4");
//
//		neo4jService.saveFriendship("张2","张1");
//		neo4jService.saveFriendship("张2","张5");
//		neo4jService.saveFriendship("张2","张6");
//
//		neo4jService.saveFriendship("张3","张7");
//
//		neo4jService.saveFriendship("张4","张8");
//
//		neo4jService.saveFriendship("张5","张2");
//		neo4jService.saveFriendship("张5","张9");
//
//		neo4jService.saveFriendship("张7","张3");
//		neo4jService.saveFriendship("张7","张10");
//
//		neo4jService.saveFriendship("张8","张4");
//	}

	/**
	 * 根据name查询 both 友谊关系
	 */
//	@Test
//	public void getBothFriendship(){
//		List<FriendshipRelation> friendshipRelationList1 = studentRepository.bothFriendship("张1");
//
//	}

	/**
	 * 根据name查询 in 友谊关系
	 */
//	@Test
//	public void getInFriendship(){
//		List<FriendshipRelation> friendshipRelationList1 = studentRepository.inFriendship("张1");
//	}

	/**
	 * 根据name查询 out 友谊关系
	 */
//	@Test
//	public void getOutFriendship(){
//		List<FriendshipRelation> friendshipRelationList1 = studentRepository.outFriendship("张1");
//	}

	/**
	 * 删除 1 -> 3 友谊关系
	 */
//	@Test
//	public void deleteFriendship(){
//		neo4jService.deleteFriendship("张1","张3");
//	}

}
