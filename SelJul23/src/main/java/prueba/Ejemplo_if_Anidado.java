package prueba;

public class Ejemplo_if_Anidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =26;
		if(i>15){
			if(i>25){
				System.out.println("a la playa");
			}else {
				System.out.println("a la montaña");	
			}
		}else {
			System.out.println("a descansar");	
		}
	}
}