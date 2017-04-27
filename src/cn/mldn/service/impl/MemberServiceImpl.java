package cn.mldn.service.impl;
import cn.mldn.dao.IMemberDAO;
import cn.mldn.service.IMemberService;
import cn.mldn.util.factory.Factory;
public class MemberServiceImpl implements IMemberService {
	@Override
	public boolean checkMid(String id) throws Exception {
		if (id == null || "".equals(id)) {
			return false ;
		}
		IMemberDAO memberDAO = Factory.getDAOInstance("member.dao") ;
		return memberDAO.findById(id) == null;
	}
}
