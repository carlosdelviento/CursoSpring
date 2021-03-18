package uy.com.cb.domain;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="rol")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRol;
	
	@NotEmpty
	private String nombre;
}
