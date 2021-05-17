package com.mariadb.test;

import java.util.List;

public interface MemberService {
	
	public List<MemberDTO> getMember(String mId);

}
