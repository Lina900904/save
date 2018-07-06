package service;

import java.util.ArrayList;
import java.util.List;

import domain.*;
import service.*;

public class MemberServiceImpl implements MemeberService{
	private static MemeberService intstance = new MemberServiceImpl();
	public static MemeberService getInstance() {return intstance;}
	private MemberServiceImpl() {}
	@Override
	public void MembercreateJoin(MemberBean Member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<MemberBean> Memberlist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MemberBean> MemberfindByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean MemberfindById(MemberBean Member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void MemberUpdate(MemberBean Member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void MemberDelete(MemberBean Member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int MemberCount() {
		// TODO Auto-generated method stub
		return 0;
	}

		
	
	

}
