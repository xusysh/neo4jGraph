package com.graphdatabase.dao;

import com.graphdatabase.model.Test.Path;
import com.graphdatabase.model.node.PersonNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    List<PersonNode> getAllPersons();

    PersonNode getPersonById(@Param("person_id")long person_id);

    List<Path> getPath();

}
