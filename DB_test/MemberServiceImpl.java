package com.mariadb.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
    MemberDAO TestDAO;
    
    @Override
    public List<MemberDTO> getMember(String mId) {
    	
          return TestDAO.getMember(mId);
    }

}
