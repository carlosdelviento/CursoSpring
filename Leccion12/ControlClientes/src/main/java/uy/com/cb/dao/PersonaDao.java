package uy.com.cb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uy.com.cb.domain.Persona;

public interface PersonaDao extends JpaRepository<Persona, Long> {
	
}
