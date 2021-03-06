package ec.edu.ups.dao;
import java.util.List;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.telefono;

public interface GenericDAO<T ,ID> {
	
	public void createTable();

	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();

	Usuario buscar(String email, String contrasena);
	public List <telefono> buscarCedula(String cedula); 
	public List <telefono> buscarCorreo(String correo);
	public List <telefono> buscarCedInv(String cedula);
	
	void deleteByID(ID id);
	List<T> findAll();

}
