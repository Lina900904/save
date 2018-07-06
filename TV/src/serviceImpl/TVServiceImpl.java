package serviceImpl;

import domain.*;
import service.*;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

import controller.*;


public class TVServiceImpl implements TVService{
	CaptionTVBean tv ;
	
	public TVServiceImpl() {
	tv = new CaptionTVBean();
	}

	@Override
	public void  powerOn() {
	tv.setPower(true);

		tv.setChannel(0);
	}
	@Override
	public  void powerOff() {
		tv.setPower(false);
		
	}

	@Override
	public String channelUp() {
		String result ="";
			tv.setChannel(tv.getChannel()+1);
			return result = "채널이 "+tv.getChannel()+"로 변경되었습니다";
		}


	@Override
	public String channelDown() {
		String result ="";
		tv.setChannel(tv.getChannel()-1);
		return result = "채널이 "+tv.getChannel()+"로 변경되었습니다";
	}
		
	



	@Override
	public void order(String txt) {
		String order ="";
		if(txt.equals("1")) {
			tv.setText("유튜브");

		}else if(txt.equals("2")) {
			tv.setText("페이스북");
		}else {
			tv.setText("넥플릭스");
		}
	
	}

	@Override
	public String show(){
		String show =	"현재채널:"+tv.getChannel()+tv.getText()+"가 실행되고 있습니다";
		return show;
	}



}
