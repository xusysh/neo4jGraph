package com.graphdatabase.service;

import com.graphdatabase.entity.nodeEntity.StudentNode;
import com.graphdatabase.entity.relationEntity.FriendshipRelation;
import com.graphdatabase.repository.nodeRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

@Repository
public class Neo4jServiceImpl {

    @Autowired
    private StudentRepository studentRepository;


    public void saveFriendship(String fromName, String toName) {
        StudentNode from = studentRepository.findByName(fromName);
        StudentNode to = studentRepository.findByName(toName);

        FriendshipRelation friendshipRelation = new FriendshipRelation();
        friendshipRelation.setFrom(from);
        friendshipRelation.setTo(to);

        //只需要在from节点保存关系即可
        from.addRelation(friendshipRelation);
        studentRepository.save(from);
    }

    //删除节点时，使用find，save 需要@Transactional注解
    @Transactional(rollbackFor = Exception.class)

    public void deleteFriendship(String fromName, String toName) {
        StudentNode fromStudentNode = studentRepository.findByName(fromName);
        List<FriendshipRelation> friendshipRelationList = fromStudentNode.getFriendshipRelationList();
        for (Iterator<FriendshipRelation> iterator = friendshipRelationList.iterator(); iterator.hasNext();) {
            FriendshipRelation relation = iterator.next();
            StudentNode fromNode = relation.getFrom();
            StudentNode toNode = relation.getTo();

            String fromNodeName = fromNode.getName();
            String toNodeName = toNode.getName();
            //判断 fromName 和 toName 需要删除的关系是否相等
            if(fromNodeName.equals(fromName) && toNodeName.equals(toName)){
                iterator.remove();
            }
        }
        //只需要在from节点保存关系即可
        studentRepository.save(fromStudentNode);
    }

}
