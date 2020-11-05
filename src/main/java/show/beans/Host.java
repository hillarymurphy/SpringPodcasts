package show.beans;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Host {
	
	private String hName;
	private String profession;
	private int numOfShows;
	
	
	public Host(String hName, String profession, int numOfShows) {
		super();
		this.hName = hName;
		this.profession = profession;
		this.numOfShows = numOfShows;
	}
}