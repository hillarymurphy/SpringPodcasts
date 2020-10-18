package show.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import show.beans.Host;
import show.beans.Podcast;

@Configuration
public class BeanConfiguration {

	@Bean
	public Podcast podcast() {
		Podcast bean = new Podcast("What Fresh H*ll Laughing in the Face of Motherhood");
		//Podcast bean = new Podcast( );
		//bean.setName("Female Criminals");
		//bean.setGenre("True Crime");
		//bean.setSubscriberCount(2000000);
		return bean;
	}
	
	@Bean
	public Host host() {
	Host bean = new Host("Margaret Ables", "Theatre Teacher and Mom", 1);
	return bean;
	}
}
