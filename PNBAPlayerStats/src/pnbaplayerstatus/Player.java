package pnbaplayerstatus;

import java.time.LocalDate;

public class Player implements Comparable<Player>
{

	private String firstName, lastName;	
	private String college;
	private int age,draft_round,draft_number,gp;//gp means Number of games played
	private double height,weight,pts,reb,ast,net_rating,
	                oreb_pct,dreb_pct,usg_pct, ts_pct,ast_pct; //pts:points;reb:rebound;ast:assist;
	private Country country; //the type Country is enum class
	private Team team; //the type Team is enum class
	private LocalDate draft_Year,season;
	        
	
	public Player(String firstName,String lastName,Team team,String college,int age, int draft_round,
			int draft_number,double height,double weight,Country country, int gp, 
			double pts,double reb,double ast,double net_rating,double oreb_pct,
			double dreb_pct, double usg_pct, double ts_pct,double ast_pct) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.college = college;
		this.age = age;
		this.draft_round = draft_round;
		this.draft_number = draft_number;
		this.height = height;
		this.weight = weight;
		this.country = country;
		this.gp = gp;
		this.pts = pts;
		this.reb = reb;
		this.ast = ast;
		this.net_rating = net_rating;
		this.oreb_pct = oreb_pct;
		this.dreb_pct = dreb_pct;
		this.usg_pct = usg_pct;
		this.ts_pct = ts_pct;
		this.ast_pct = ast_pct;
		
	}

	public double getOreb_pct() {
		return oreb_pct;
	}

	public void setOreb_pct(double oreb_pct) {
		this.oreb_pct = oreb_pct;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDraft_round() {
		return draft_round;
	}

	public void setDraft_round(int draft_round) {
		this.draft_round = draft_round;
	}

	public int getDraft_number() {
		return draft_number;
	}

	public void setDraft_number(int draft_number) {
		this.draft_number = draft_number;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public LocalDate getDraft_Year() {
		return draft_Year;
	}

	public void setDraft_Year(LocalDate draft_Year) {
		this.draft_Year = draft_Year;
	}

	public LocalDate getSeason() {
		return season;
	}

	public void setSeason(LocalDate season) {
		this.season = season;
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public double getPts() {
		return pts;
	}

	public void setPts(double pts) {
		this.pts = pts;
	}

	public double getReb() {
		return reb;
	}

	public void setReb(double reb) {
		this.reb = reb;
	}

	public double getAst() {
		return ast;
	}

	public void setAst(double ast) {
		this.ast = ast;
	}

	public double getNet_rating() {
		return net_rating;
	}

	public void setNet_rating(double net_rating) {
		this.net_rating = net_rating;
	}

	public double getDreb_pct() {
		return dreb_pct;
	}

	public void setDreb_pct(double dreb_pct) {
		this.dreb_pct = dreb_pct;
	}

	public double getUsg_pct() {
		return usg_pct;
	}

	public void setUsg_pct(double usg_pct) {
		this.usg_pct = usg_pct;
	}

	public double getTs_pct() {
		return ts_pct;
	}

	public void setTs_pct(double ts_pct) {
		this.ts_pct = ts_pct;
	}

	public double getAst_pct() {
		return ast_pct;
	}

	public void setAst_pct(double ast_pct) {
		this.ast_pct = ast_pct;
	}



	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + ", college=" + college + ", age=" + age
				+ ", draft_round=" + draft_round + ", draft_number=" + draft_number + ", gp=" + gp + ", height="
				+ height + ", weight=" + weight + ", pts=" + pts + ", reb=" + reb + ", ast=" + ast + ", net_rating="
				+ net_rating + ", oreb_pct=" + oreb_pct + ", dreb_pct=" + dreb_pct + ", usg_pct=" + usg_pct
				+ ", ts_pct=" + ts_pct + ", ast_pct=" + ast_pct + ", country=" + country + ", team=" + team
				+ ", draft_Year=" + draft_Year + ", season=" + season + "]";
	}

	@Override
	public int compareTo(Player player1) {
		// TODO Auto-generated method stub
		if(this.getLastName().equals(player1.getLastName()))
			return this.getFirstName().compareTo(player1.getFirstName());
	else
		return this.getLastName().compareTo(player1.getLastName());
	}

}
