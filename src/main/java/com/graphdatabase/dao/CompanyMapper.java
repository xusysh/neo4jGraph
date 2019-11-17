package com.graphdatabase.dao;

import com.graphdatabase.model.node.CompanyNode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompanyMapper {

    List<CompanyNode> getAllCompanies();

}
