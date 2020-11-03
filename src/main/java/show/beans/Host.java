package show.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Host {
	
	private String hName;
	private String profession;
	private int numOfShows;
	
	public Host() {
		super();
	}
	
	public Host(String hName, String profession, int numOfShows) {
		super();
		this.hName = hName;
		this.profession = profession;
		this.numOfShows = numOfShows;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getNumOfShows() {
		return numOfShows;
	}

	public void setNumOfShows(int numOfShows) {
		this.numOfShows = numOfShows;
	}

	@Override
	public String toString() {
		return "Host [hName=" + hName + ", profession=" + profession + ", numOfShows=" + numOfShows + "]";
	}

}
