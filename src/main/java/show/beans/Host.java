package show.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Host {
	
	private String hostName;
	private String profession;
	private int numOfShows;
	
	public Host() {
		super();
	}
	
	public Host(String hostName, String profession, int numOfShows) {
		super();
		this.hostName = hostName;
		this.profession = profession;
		this.numOfShows = numOfShows;
	}

	public String gethostName() {
		return hostName;
	}

	public void sethostName(String hostName) {
		this.hostName = hostName;
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
		return "Host [hostName=" + hostName + ", profession=" + profession + ", numOfShows=" + numOfShows + "]";
	}

}
