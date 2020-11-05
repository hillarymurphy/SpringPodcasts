package show.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Podcast {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String genre;
	@Column(name="subscriber_count")
	private int subscriberCount;
	@Autowired
	private Host host;
	
	
	public Podcast(String name) {
		super();
		this.name = name;
	}
	public Podcast(String name, String genre, int subscriberCount) {
		super();
		this.name = name;
		this.genre = genre;
		this.subscriberCount = subscriberCount;
	}
	
	public Podcast(int id, String name, String genre, int subscriberCount) {
		super();
		this.id = id;
		this.genre = genre;
		this.subscriberCount = subscriberCount;
	}
}