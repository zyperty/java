
public class Robot {
	
//	Atributos de la clase Robot (se declaran las variables)
	int ext;
	boolean extras;
	
//	Contructor (se inicializan las variables)
	public Robot() {
		ext = 10;
		extras = true;
	}
	
// Metodo caminar de la clase Robot
	
//	Sobrecarga de metodos 
	public void caminar() {
		ext = ext + 2;
	}
	
	public void caminar(int numero) {
		ext = ext + numero;
		
	}
	
	public void caminar(int numero, int numero2) {
		ext = ext + numero + numero2;
		
	}
	public void caminar(String nombre) {
		System.out.println(nombre);
		
	}
	
}
