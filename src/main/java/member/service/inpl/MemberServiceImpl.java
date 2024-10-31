package member.service.inpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.bean.MemberDTO;
import member.dao.MemberDAO;
import member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	public MemberDAO memberDAO;
	
	@Override
	public MemberDTO login(String id, String pwd) {
		Map <String, String> map = new HashMap<>();
		
		map.put("id",id);
		map.put("pwd",pwd);
		
		MemberDTO memberDTO = memberDAO.login(map);
		
		if(memberDTO != null) {
			return memberDTO;
		}
		else {
			return null;
		}
	}

}
