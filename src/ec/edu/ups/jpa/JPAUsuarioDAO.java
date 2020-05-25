package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Contacto;
import ec.edu.ups.modelo.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, String> implements UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
	}

	@Override
	public Usuario read(String id) {
		// TODO Auto-generated method stub
		Usuario usuarioObject = null;
		return usuarioObject;
	}

	@Override
	public void update(Usuario entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Usuario> find() {
		// TODO Auto-generated method stub
		List<Usuario> list = new ArrayList<Usuario>();
		return list;
	}

	@Override
	public List<Contacto> buscarCorreo(String correo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
