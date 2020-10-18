package show.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

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
	
	public Podcast() {
		super();
		this.subscriberCount = 150000;
	}
	
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getSubscriberCount() {
		return subscriberCount;
	}

	public void setSubscriberCount(int subscriberCount) {
		this.subscriberCount = subscriberCount;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Podcast [id=" + id + ", name=" + name + ", genre=" + genre + ", subscriberCount=" + subscriberCount
				+ ", host=" + host + "]";
	}

}
