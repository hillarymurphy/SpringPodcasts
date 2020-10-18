package show.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import show.beans.Podcast;

@Repository
public interface PodcastRepository extends
	JpaRepository<Podcast, Long> { }