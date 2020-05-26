package ec.edu.ups.test;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

public class testC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				UsuarioDAO user = DAOFactory.getFactory().getUsuarioDAO();
				Usuario usuario = new Usuario("0124589631", "Irina", "Lopez", "amor@gmail.com", "123");
				user.create(usuario);
				
				//usuario=user.buscar("cris@gmail.com", "123");
				
				/*ystem.out.println(user.buscar("cris@gmail.com", "123").getApellido());
				TelefonoDAO telf = DAOFactory.getFactory().getTelefonoDAO();
				List<Telefono> listT = new ArrayList<Telefono>();
				
				Telefono telefono= new Telefono();
				listT=telf.buscarCorreo("cris@gmail.com");
				
				for (Telefono telfonoo : listT) {
					 
					 System.out.println(telfonoo.getUsuario().getNombre());
				}
*/
	}

}
