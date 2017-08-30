
public class Main {
//	Estructura basica de codigo Java.
	public static void main(String[] argumentos){
		
//		Creacion de un Objeto 
		Robot bender = new Robot();
		
		
//		Accediendo a una propiedad del objeto
		System.out.println(bender.ext);
		
		bender.caminar();
		bender.caminar(12);
		bender.caminar(3, 2);
		bender.caminar("Mordelon");
		
		System.out.println(bender.ext);
	}
}
