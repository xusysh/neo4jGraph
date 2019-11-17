package com.graphdatabase;

import com.graphdatabase.dao.CompanyMapper;

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



	@Autowired
	private CompanyMapper companyMapper;

	@Test
	public void saveFriendship(){

	}



}
