package uy.com.cb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uy.com.cb.domain.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
	Usuario findByUsername(String username);
}
