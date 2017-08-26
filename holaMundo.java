public class holaMundo {
	
	public static void main(String[] args) {

		try{
			System.out.println("Hola" + args[0]);
		}catch(Exception e){
			System.out.println("la ejecucion correcta es:");
			System.out.println("java holaMundo [tu nombre]");
		}
		
	}
}