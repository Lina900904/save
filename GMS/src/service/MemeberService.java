package service;

import java.util.List;

import domain.ExamBean;
import domain.MemberBean;

public interface MemeberService {
	public void MembercreateJoin(MemberBean Member);
	public List<MemberBean> Memberlist();
	public List<MemberBean> MemberfindByName(String name);
	public MemberBean MemberfindById(MemberBean Member);
	public void MemberUpdate(MemberBean Member);
	public void MemberDelete(MemberBean Member);
	public int MemberCount();
}
