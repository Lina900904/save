package controller;

import java.util.List;

import javax.swing.JOptionPane;

import service.*;
import controller.*;
import dao.ExamDAOImpl;
import domain.*;

enum Kind {
	EXIT
}

public class GMScontroller {
	private static GMScontroller intance = new GMScontroller();
	public static GMScontroller getInstance() {return intance;}
	private GMScontroller() {};
	
	public static void main(String[] args) {
		ExamBean exam = null;
		MemberBean mem =null;
	
		while (true) {
			
			switch (JOptionPane.showInputDialog("0.EXIT 1.이름/월 2. 성적")) {
			case "0":
				return;

			case "1":
			 exam = new ExamBean();
				String[] arr =JOptionPane.showInputDialog("이름 / 월").split("/");
				exam.setMonth(arr[1]);
				exam.setMem_id("저스티스4");
			
				
				
			/*	List<MemberBean> list = MemberServiceImpl.getInstance().MemberfindByName(arr[0]);
				if(list.size()==0) {
					System.out.println("해당 이름의 학생이 없음");
				}else if(list.size()==1) {
					exam.setMem_id(list.get(0).getMem_id());
				}else {
					System.out.println(list);
				}*/

				break;
			case "2":

				exam.setScore(JOptionPane.showInputDialog("JAVA / SQL / R /HTML5 / PYTHON 의 점수"));
				ExamServiceImpl.getInstance().Examcreate(exam);

				break;
			case "3":
				break;

			default:
				break;
			}
		}

	}
}
