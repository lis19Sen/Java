package pnbaplayerstatus;

import java.time.LocalDate;

public class Player {

	private String name;
	private String team;
	private String college;
	private int age,draft_round,draft_number;
	private double height,weight;
	private Country country; //the type Country is enum class
	private DraftedStatus draftedStatus;
	private LocalDate draft_Year,season;
	private int gp;          //gp means Number of games played
	private double pts,reb,ast; //pts:points;reb:rebound;ast:assist;
	private double net_rating,dreb_pct,usg_pct, ts_pct,ast_pct;
	
	public Player(String name,String team,String college,int age, int draft_round,
			int draft_number,double height,double weight,Country country, int gp, double pts,double reb,double ast,
			double net_rating,double dreb_pct,double usg_pct,double ts_pct,double act_pct) 
	{
		this.name = name;
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
		this
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
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
		return "Player [name=" + name + ", team=" + team + ", college=" + college + ", age=" + age + ", draft_round="
				+ draft_round + ", draft_number=" + draft_number + ", height=" + height + ", weight=" + weight
				+ ", country=" + country + ", draft_Year=" + draft_Year + ", season=" + season + ", gp=" + gp + ", pts="
				+ pts + ", reb=" + reb + ", ast=" + ast + ", net_rating=" + net_rating + ", dreb_pct=" + dreb_pct
				+ ", usg_pct=" + usg_pct + ", ts_pct=" + ts_pct + ", ast_pct=" + ast_pct + "]";
	}
	
}
