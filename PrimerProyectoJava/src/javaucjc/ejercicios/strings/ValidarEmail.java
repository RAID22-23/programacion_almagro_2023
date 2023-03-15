package javaucjc.ejercicios.strings;

public class ValidarEmail {

	public static void main(String[] args) {
		
		String email = "   asdsadh@dfge.es.esdsaf   ";
		
		email = email.trim();
		String mensajeError = "";
		
		//Validamos el email
		//El email debe contener solo una @
		if (email.indexOf("@")==-1) {
			mensajeError += "El email no tiene arroba. ";
		}else if (email.indexOf("@")!=email.lastIndexOf("@")) {
			mensajeError += "El email no puede tener más de una arroba. ";
		}else {
			//Después de la @ tiene que haber al menos un punto
			String dominio = email.substring(email.indexOf("@")+1);
			if (dominio.indexOf(".")==-1) {
				mensajeError += "Después de la @ debe haber al menos un punto. ";
			}else {
			
				int diferencia = dominio.length() - (dominio.lastIndexOf(".")+1);
				if (diferencia<2 || diferencia>6) {
					mensajeError += "Después del último punto solo puede haber "
							+ "entre 2 y 6 caracteres. ";
				}
			}
		}
		
		//El email no puede tener espacios en blanco
		if (email.contains(" ")) {
			mensajeError += "El email no puede tener espacios en blanco. ";
		}
		
		
		
		
		//Compruebo si ha habido errores
		if (mensajeError.equals("")) {
			System.out.println("El email "+ email +" es correcto");
		}else {
			System.out.println("El email "+ email 
					+" no es correcto "+ mensajeError);
		}

	}

}
