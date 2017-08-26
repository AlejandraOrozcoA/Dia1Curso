//el archivo se debe llamar igual a la clase publica (persona)
//se ejecuta la clase con el main (curso)
public class Persona{ 

	//variables
	String name;
	String sexo;
	int edad;

	//metodos
	public void caminar(){
		System.out.println(name + "Esta caminando");
	}

	public void estudiar(){
		System.out.println(name + "Esta estudiando");
	}

	public void comer(String comida){
		System.out.println(name + "esta comiendo " + comida);
	}

	public void pedirCervesa(){
		if (edad >= 18){
			System.out.println("si se la dan");
		}
		else {
			System.out.println("no tienes edad para tomar");
		}
	}
}

class Curso{
	public static void main(String[] args) {

		//creando el objeto
		Persona juan = new Persona();
		juan.name = "Juan Perez";
		juan.sexo = "M";
		juan.edad = 15;

		//llamando metodos
		juan.caminar();
		juan.estudiar();
		juan.comer("torta cubana");
		juan.pedirCervesa();

		//crea otro objeto
		Persona bety = new Persona();
		bety.name = "beatriz";
		bety.sexo = "F";
		bety.edad = 18;

		bety.caminar();
		bety.estudiar();
		bety.pedirCervesa();
	}
}