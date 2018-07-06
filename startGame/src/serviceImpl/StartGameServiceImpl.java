package serviceImpl;


import java.util.ArrayList;
import java.util.List;

import controller.*;
import domain.*;
import service.*;


public class StartGameServiceImpl implements StartGameService{
	List<UnitBean> list;

	public StartGameServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public List<UnitBean> list() {
		return list;
	}
	
	
	
}
