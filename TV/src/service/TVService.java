package service;

import domain.*;
import service.*;
import controller.*;

public interface TVService {
	public void  powerOn();
	public void powerOff();
	public String channelUp();
	public String channelDown();
	public void order(String or);
	public String show();
	
}
