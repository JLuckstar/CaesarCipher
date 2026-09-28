import java.util.*;
public class CaesarCipher {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Variable
		String mensajeOriginal;
		String mensajeCifrado = "";
		char alfabeto;
		int i;
		
		// Constante
		int DESPLAZAMIENTO = 10;
		
		//Titulo del programa
		imprimirTitulo();
				
		// Solicitud de Datos
		System.out.println("Escribe el mensaje original: ");
		mensajeOriginal = sc.nextLine();
		
		System.out.println("Escribe el desplazamiento: ");
		DESPLAZAMIENTO = sc.nextInt();
				
		// Proceso
		for(i = 0; i < mensajeOriginal.length(); i++)
		{
			// Desplaza cada caracter a la vez
			alfabeto = mensajeOriginal.charAt(i);
			/*System.out.println("Se desplaza: " + alfabeto);*/
			
			// Si el alfabeto se encuentra entre a (97) y z (122)
			if(alfabeto >= 'a' && alfabeto <= 'z')
			{
				// El alfabeto se desplaza
				alfabeto = (char)(alfabeto + DESPLAZAMIENTO);
				
				// Si el alfabeto de desplazamiento es mayor que 'z'
				if(alfabeto > 'z') // Si el valor del ASCII es mayor que 122
				{
					// Cambiar a la posición inicial
					alfabeto = (char)(alfabeto + 'a' - 'z' - 1);
				}
				mensajeCifrado = mensajeCifrado + alfabeto;
				/*System.out.println("El caracter cifrado es: " + alfabeto);*/
			}
			
			// Si el alfabeto se encuentra entre A (65) y Z (90)
			else if(alfabeto >= 'A' && alfabeto <= 'Z')
			{
				// El alfabeto se desplaza 
				alfabeto = (char)(alfabeto + DESPLAZAMIENTO);
				
				// Si el alfabeto es de desplazamiento es mayor que 'Z'
				if(alfabeto > 'Z') // Si el valor del ASCII es mayor que 90
				{
					// Cambiar a la posición inicial
					alfabeto = (char)(alfabeto + 'A' - 'Z' - 1);
				}
				mensajeCifrado = mensajeCifrado + alfabeto;
				/*System.out.println("El caracter cifrado es: " + alfabeto);*/
			}
					
			else
			{
				mensajeCifrado = mensajeCifrado + alfabeto;
			}
		}
				
		System.out.println("\nTu mensaje cifrado es: " + mensajeCifrado);
		/*System.out.println("Tu desplazamiento es: " + DESPLAZAMIENTO);*/

		// Despedida
		imprimirDespedida();

		// Cierre del programa
		System.exit(0);
	}
			
	// Imprimir titulo
	public static void imprimirTitulo()
	{
		System.out.println();
		System.out.println("=============================");
		System.out.println("===      CaesarCipher     ===");
		System.out.println("=============================");
		System.out.println();
	}
			
	public static void imprimirDespedida()
	{
		System.out.println();
		System.out.println("==========================================");
		System.out.println("=== Gracias por utilizar mi aplicación ===");
		System.out.println("====== Por: Jean P. Figueroa Roldán ======");
		System.out.println("==========================================");
		System.out.println();
	}
}
