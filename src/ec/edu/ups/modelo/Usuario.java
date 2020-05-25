package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private String cedula;
	private String nombres;
	private String apellidos;
	private String correo;
	private String password;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<telefono> telefonos = new ArrayList<telefono>();
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String cedula, String nombres, String apellidos, String correo, String password) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.password = password;
	}
	
	public Usuario(String cedula, String nombres, String apellidos, String correo, String password, List<telefono> telefonos) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.password = password;
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombres + ", apellido=" + apellidos + ", correo=" + correo + ", pwd="
				+ password + "]";
	}
}
