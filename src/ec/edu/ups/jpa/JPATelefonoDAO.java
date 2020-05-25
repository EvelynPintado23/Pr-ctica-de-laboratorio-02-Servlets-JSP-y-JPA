package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Contacto;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.telefono;

public class JPATelefonoDAO extends JPAGenericDAO<telefono, Integer> implements TelefonoDAO {


	public JPATelefonoDAO() {
		super(telefono.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public telefono read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<telefono> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscar(String email, String contrasena) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<telefono> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contacto> buscarCorreo(String correo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<telefono> buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contacto> obtenerContacto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contacto> buscarCedInv(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

}
