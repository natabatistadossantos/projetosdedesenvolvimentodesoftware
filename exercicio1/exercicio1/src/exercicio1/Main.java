package exercicio1;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		for (int i=0;i<10;i++) {
			int aleatorio = random.nextInt(100);
			numeros.add(aleatorio);
			if(aleatorio % 2 ==0) {
				System.out.println("imprimindo os numeros pares: ");
				System.out.println("posição"+ i +":" + aleatorio);
			}
		}
		
		
System.out.println(numeros);
	

	}
}
