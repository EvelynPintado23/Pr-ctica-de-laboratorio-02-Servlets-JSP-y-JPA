package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.telefono;

public class JPATelefonoDAO extends JPAGenericDAO<telefono, Integer> implements TelefonoDAO {


	public JPATelefonoDAO() {
		super(telefono.class);
		// TODO Auto-generated constructor stub
	}
}