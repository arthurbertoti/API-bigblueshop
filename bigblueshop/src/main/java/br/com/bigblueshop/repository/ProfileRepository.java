package br.com.bigblueshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bigblueshop.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{

	Optional<Profile> findById(Long id);
	
}
