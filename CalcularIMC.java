import java.util.Scanner; 

public class CalcularIMC{
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in); 
		
		double peso, altura, valorIMC; 
		
		System.out.println(); 
		System.out.print("Informe o seu peso em kg: "); 
		peso = entrada.nextDouble();  
		
		System.out.print("Informe a sua altura em metros: "); 
		altura = entrada.nextDouble(); 
		
		valorIMC = peso/(altura * altura); 
		
		if (valorIMC < 20){
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Abaixo do peso. ");
		    System.out.println();
		}else if(valorIMC >= 20 && valorIMC <= 25){
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Normal. ");
		    System.out.println();
			
		}else if(valorIMC > 25 && valorIMC <= 30){
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Acima do peso. ");
		    System.out.println();
		
	}else if(valorIMC > 30 && valorIMC <= 35){
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Obeso. ");
		    System.out.println();
	}else{ 
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Obesidade mórbida. ");
		    System.out.println();
		
	
	}
	
} 
}
