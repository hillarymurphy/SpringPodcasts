package show.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import show.beans.Podcast;
import show.repository.PodcastRepository;


@Controller
public class WebController {
	@Autowired
	PodcastRepository repo;
	
	@GetMapping({ "/", "viewAll" })
		public String viewAllPodcasts(Model model) {
			if(repo.findAll().isEmpty()) { return addNewPodcast(model); }
			
			model.addAttribute("podcasts", repo.findAll());
			return "results";
	}
	
	@GetMapping("/inputPodcast")
		public String addNewPodcast(Model model) {
			Podcast p =	new	Podcast();
			model.addAttribute("newPodcast", p);
			return "input";
	}
	
	@PostMapping("/inputPodcast")
		public String addNewPodcast (@ModelAttribute Podcast p, Model model) {
			repo.save(p);
			return viewAllPodcasts(model);
	}
	
	@GetMapping("/edit/{id}")
		public String showUpdatePodcast(@PathVariable("id") long id, Model model) {
		Podcast p = repo.findById(id).orElse(null);
		model.addAttribute("newPodcast", p);
		return "input";
	}
	
	@PostMapping("/update/{id}")
		public String revisePodcast(Podcast p, Model model) {
		repo.save(p);
		return viewAllPodcasts(model);
	}
	
	@GetMapping("/delete/{id}")
		public String deleteUser(@PathVariable("id") long id, Model model) {
		Podcast p = repo.findById(id).orElse(null);
		repo.delete(p);
		return viewAllPodcasts(model);
	}
}
