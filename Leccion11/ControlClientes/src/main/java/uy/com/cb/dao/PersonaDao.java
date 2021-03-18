package uy.com.cb.dao;

import org.springframework.data.repository.CrudRepository;
import uy.com.cb.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {
	
}
