package uy.com.cb.dao;

import uy.com.cb.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {
	
}
