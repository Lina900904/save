package dao;

import java.util.List;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO{
	public static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {return instance;}
	private MemberDAOImpl() {};

	@Override
	public void insertMember(MemberBean MemberBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberBean> selectMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> selectMemberSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectMemberOne(MemberBean MemberBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMember(MemberBean MemberBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean MemberBean) {
		// TODO Auto-generated method stub
		
	}

}
