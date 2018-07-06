package dao;

import java.util.List;

import domain.MemberBean;
import domain.MemberBean;

public interface MemberDAO {
	public void insertMember(MemberBean MemberBean);
	public List<MemberBean> selectMemberList();
	public List<MemberBean> selectMemberSome(String word);
	public MemberBean selectMemberOne(MemberBean MemberBean);
	public int countMember();
	public void updateMember(MemberBean MemberBean);
	public void deleteMember(MemberBean MemberBean);

}
