package uy.com.cb.servicio;

import java.util.List;

import uy.com.cb.domain.Persona;

public interface PersonaService {

	public List<Persona> listarPersonas();

	public void guardar(Persona persona);

	public void eliminar(Persona persona);

	public Persona encontrarPersona(Persona persona);
}
