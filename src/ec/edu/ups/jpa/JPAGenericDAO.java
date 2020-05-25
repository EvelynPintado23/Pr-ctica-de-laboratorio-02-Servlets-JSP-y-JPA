package ec.edu.ups.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.modelo.Contacto;
import ec.edu.ups.modelo.Usuario;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {

	private Class <T> persistentClass;
	protected EntityManager em;
	
	public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("ProjectJPA2").createEntityManager();
	}
	
	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		}catch (Exception e){
			System.out.println("Ingresando: /n");
			System.out.println("ERROR: JPAGenericDAO:create " + e);
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}	
	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("ERROR:JPAGenericDAO:update " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}
	

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscar(String email, String contrasena) {
		// TODO Auto-generated method stub
		Query nativeQuery = em.createNativeQuery("SELECT * FROM usuario WHERE correo = ? AND pwd =? ", Usuario.class);
        nativeQuery.setParameter(1, email);
        nativeQuery.setParameter(2, contrasena);
        return (Usuario) nativeQuery.getSingleResult();
	}

	@Override
	public List<Contacto> buscarCorreo(String correo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub
		T entity = this.read(id);
		if (entity != null)
			this.delete(entity);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		List<T> lista = null;
		try {
			javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(persistentClass));
			lista = em.createQuery(cq).getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}