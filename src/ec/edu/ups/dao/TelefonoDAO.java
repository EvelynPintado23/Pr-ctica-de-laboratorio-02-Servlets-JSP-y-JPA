package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.modelo.telefono;

public interface TelefonoDAO extends GenericDAO<telefono, Integer >  {
	
	List<telefono> buscarCedula(String cedula);
	public List<telefono> buscarCedInv(String cedula);



}
