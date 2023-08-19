package prueba;

public class Ejemplo_Arreglo_Unidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int[] intArray2;
		
		String[] arr;
		arr=new String[5];
		
		arr[0]="cero";
		arr[1]="uno";
		arr[2]="dos";
		arr[3]="tres";
		arr[4]="cuatro";
		
		System.out.println("Elemento en el indice 1:" +arr[1]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elemento en el indice "+i+":" +arr[i]);
		}
	}
}