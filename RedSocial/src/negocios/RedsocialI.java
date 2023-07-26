package negocios;

import java.util.List;

import entidades.usuarios;

public interface RedsocialI {
	
	void registrarse(List<usuarios> usuarios, int resultado);
	void agregaramigos(List<usuarios> usuarios, int resultado);
	void publicarmensajes(List<usuarios> usuarios, int resultado);
	void comentarenpublicaciones(List<usuarios> usuarios, int resultado);
	void mensajesprivados(List<usuarios> usuarios, int resultado);
	void actualizarperfil(List<usuarios> usuarios, int resultado);
}
