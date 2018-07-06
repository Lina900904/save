package service;

import domain.TeamBean;

public interface TeamService {
	public String createBmi(TeamBean team);
	public String avgHeight();
	public String avgWeight();
	public int maxHeight();
	public int minHeight();
	public void addList(TeamBean team);
	public TeamBean[] list();


	public String maxName();
	public String minName();
	public String createGender(TeamBean team);
	public void create( TeamBean team);
	public String showList( );



	
}
