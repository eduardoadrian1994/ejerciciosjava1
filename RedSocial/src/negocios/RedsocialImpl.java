package negocios;



import java.util.List;

import acciones.RedSocialAcciones;
import entidades.usuarios;
import excecpciones.RedSocialExcepcion;

public class RedsocialImpl implements RedsocialI {
	//esta echo
	@Override
	public void registrarse(List<usuarios> usuarios, int resultado) {
		
		RedSocialAcciones red = new RedSocialAcciones();
		
		try {
			for(usuarios usu : usuarios) {
				red.registrarse(usu, resultado);
				System.out.println("exito");
			}
		} catch (RedSocialExcepcion e) {
			System.out.println("Ocurrió un error de tipo RedsocialExcepcion");
				System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrió un error de tipo Exception: ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("El registro esta completo");
		}

		System.out.println("Fin");
		System.out.println("--------------------------------------------------------");
	}

	//esta echo
	@Override
	public void mensajesprivados(List<usuarios> usuarios, int resultado) {
		RedSocialAcciones red = new RedSocialAcciones();
		try {
			for(usuarios usu : usuarios) {
				red.mensajesprivados(usu, resultado);
				System.out.println("exito");
			}
		} catch (RedSocialExcepcion e) {
			System.out.println("Ocurrió un error de tipo RedsocialExcepcion");
				System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrió un error de tipo Exception: ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Se envio el mensaje privado");
		}

		System.out.println("fin");
		System.out.println("--------------------------------------------------------");

	}
	
	//esta echo
	@Override
	public void agregaramigos(List<usuarios> usuarios, int resultado) {
		
		RedSocialAcciones red = new RedSocialAcciones();
		
		try {
			for(usuarios usu : usuarios) {
				red.agregaramigos(usu, resultado);
				System.out.println("exito");
			}
		} catch (RedSocialExcepcion e) {
			System.out.println("Ocurrió un error de tipo RedsocialExcepcion");
				System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrió un error de tipo Exception: ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Se agrego amigo");
		}

		System.out.println("Fin");
		System.out.println("--------------------------------------------------------");
	}
	
	//esta echo
	@Override
	public void publicarmensajes(List<usuarios> usuarios, int resultado) {
		RedSocialAcciones red = new RedSocialAcciones();
		try {
			for(usuarios usu : usuarios) {
				red.publicarmensajes(usu, resultado);
				System.out.println("exito");
			}
		} catch (RedSocialExcepcion e) {
			System.out.println("Ocurrió un error de tipo RedsocialExcepcion");
				System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrió un error de tipo Exception: ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Se publico el mensaje");
		}

		System.out.println("Fin");
		System.out.println("--------------------------------------------------------");
	}

	//esta echo
	@Override
	public void comentarenpublicaciones(List<usuarios> usuarios, int resultado) {
		RedSocialAcciones red = new RedSocialAcciones();
		try {
			for(usuarios usu : usuarios) {
				red.comentar(usu, resultado);
				System.out.println("exito");
			}
		} catch (RedSocialExcepcion e) {
			System.out.println("Ocurrió un error de tipo RedsocialExcepcion");
				System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrió un error de tipo Exception: ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Se comento");
		}
		System.out.println("Fin");
		System.out.println("--------------------------------------------------------");
	}


	//esta echo
	@Override
	public void actualizarperfil(List<usuarios> usuarios, int resultado) {
		RedSocialAcciones red = new RedSocialAcciones();
		try {
			for(usuarios usu : usuarios) {
				red.actualizarperfil(usu, resultado);
				System.out.println("exito");
			}
		} catch (RedSocialExcepcion e) {
			System.out.println("Ocurrió un error de tipo RedsocialExcepcion");
				System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrió un error de tipo Exception: ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Se actualizo el perfil");
		}
		System.out.println("Fin");
		System.out.println("--------------------------------------------------------");
	}

}
