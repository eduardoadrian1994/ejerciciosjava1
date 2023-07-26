package acciones;

import entidades.usuarios;

import excecpciones.RedSocialExcepcion;

public class RedSocialAcciones {
	
	
	public void registrarse(usuarios usuarios, int resultado) {
		
		if (usuarios.getNombre().length() > 15 ){
			throw new RedSocialExcepcion("No envies el nombre con mas de 15 caracteres para el registro");
		}else if (usuarios.getNombre().isEmpty()){
			throw new RedSocialExcepcion("No envies el nombre vacio para el registro");
		}else if (usuarios.getNombre().contains(" ")){
			throw new RedSocialExcepcion("No envies el nombre vacio con espacio para el registro");
		}else if (usuarios.getNumerotel() < 0) {
			throw new RedSocialExcepcion("No envies numero de telefono con negativos para el registro");
		}else if (usuarios.getNumerotel() < 1000000000) {
			throw new RedSocialExcepcion("No envies numero de telefono con mas de 10 caracteres para el registro");
		}else if (usuarios.getEmail().isEmpty()){
			throw new RedSocialExcepcion("No envies el email vacio para para el registro");
		}else if (usuarios.getEmail().contains(" ")){
			throw new RedSocialExcepcion("No envies el email vacio con espacio para el registro");
		}else{
			
		}
		
	}
	
	
	public void mensaje(usuarios usuarios, int resultado) {
		
		if (usuarios.getMensaje().isEmpty()){
			throw new RedSocialExcepcion("No envies mensaje vacio");
		}else if (usuarios.getMensaje().contains(" ")){
			throw new RedSocialExcepcion("No envies mensajes con espacios");
		}else{
			
		}
		
	}
	public void comentar(usuarios usuarios, int resultado) {

		if (usuarios.getComentar().isEmpty()){
			throw new RedSocialExcepcion("No envies un comentario vacio");
		}else if (usuarios.getComentar().contains(" ")){
			throw new RedSocialExcepcion("No envies comentarios con espacio para comentar");
		}else{
			
		}
	}

	public void agregaramigos(usuarios usuarios, int resultado) {

		if (usuarios.getAgregaramigos().isEmpty()){
			throw new RedSocialExcepcion("No agregues amigos vacios");
		}else if (usuarios.getAgregaramigos().contains(" ")){
			throw new RedSocialExcepcion("No eagregues amigos con el nombre vacio con espacio");
		}else{
			
		}
	}

	public void publicarmensajes(usuarios usuarios, int resultado) {

		if (usuarios.getPublicarmensajes().isEmpty()){
			throw new RedSocialExcepcion("No publiques mensajes vacios");
		}else if (usuarios.getPublicarmensajes().contains(" ")){
			throw new RedSocialExcepcion("No envies mensajes con espacio para el publicar mensajes");
		}else{
			
		}
	}

	public void mensajesprivados(usuarios usuarios, int resultado) {

		if (usuarios.getMensajeprivado().isEmpty()){
			throw new RedSocialExcepcion("No envies mensajePrivado vacio");
		}else if (usuarios.getMensajeprivado().contains(" ")){
			throw new RedSocialExcepcion("No envies mensjaes con espacio para el mensajePrivado ");
		}else{
			
		}
	}

	public void actualizarperfil(usuarios usuarios, int resultado) {
		
		if (usuarios.getNombre().length() > 15 ){
			throw new RedSocialExcepcion("No envies el nombre con mas de 15 caracteres");
		}else if (usuarios.getNombre().isEmpty()){
			throw new RedSocialExcepcion("No envies el nombre vacio para actualizar perfil");
		}else if (usuarios.getNombre().contains(" ")){
			throw new RedSocialExcepcion("No envies el nombre vacio con espacio para actualizar perfil");
		}else if (usuarios.getNumerotel() < 0) {
			throw new RedSocialExcepcion("No envies numero de telefono con negativos para actualizar perfil");
		}else if (usuarios.getNumerotel() >= 1000000000) {
			throw new RedSocialExcepcion("No envies numero de telefono con mas de 9 caracteres para actualizar perfil");
		}else if (usuarios.getEmail().isEmpty()){
			throw new RedSocialExcepcion("No envies el email vacio para actualizar perfil");
		}else if (usuarios.getEmail().contains(" ")){
			throw new RedSocialExcepcion("No envies el email vacio con espacio para actualizar perfil");
		}else{
			
		}
	}
	
}
