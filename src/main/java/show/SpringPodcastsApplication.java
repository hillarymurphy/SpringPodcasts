package show;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import show.controller.BeanConfiguration;
import show.repository.PodcastRepository;
import show.beans.Host;
import show.beans.Podcast;

@SpringBootApplication
public class SpringPodcastsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringPodcastsApplication.class, args);
		
		/*
		 * ApplicationContext appContext = new
		 * AnnotationConfigApplicationContext(BeanConfiguration.class); Podcast p =
		 * appContext.getBean("podcast", Podcast.class);
		 * System.out.println(p.toString());
		 */
				}


@Autowired
PodcastRepository repo;

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	//Using an existing bean
	Podcast p = appContext.getBean("podcast",Podcast.class);
	p.setSubscriberCount(500000);
	repo.save(p);
	
	//Creating a bean to use – not managed by Spring
	Podcast s = new Podcast("NPR Politics Podcast", "news", 90000);
	Host h = new Host("Tamara Keith", "White House Correspondent", 2);
	s.setHost(h);
	repo.save(s);
	
	List<Podcast> allMyPodcasts = repo.findAll();
	for(Podcast shows: allMyPodcasts) {
		System.out.println(shows.toString());
	}
	
	((AbstractApplicationContext) appContext).close();
}
}
