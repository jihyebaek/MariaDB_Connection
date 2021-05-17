package com.mariadb.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
    private SqlSession SqlSession;
    
    public List<MemberDTO> getMember(String mId){
          return SqlSession.selectList("com.mariadb.testmapper.getMember", mId);
    }

}
