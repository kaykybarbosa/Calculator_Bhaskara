package Kayky;

import java.util.Scanner;
public class Calculator_Bhaskara {

		public static void main(String[] args) {
				
		int R = 0;	
		double delta = 0;
	
		Scanner teclado = new Scanner(System.in);
		
	    System.out.println("-------------------------------------------");
	    System.out.println(" Programa que Calcula Equações do 2° grau ");	
	    System.out.println("-------------------------------------------");
   
	    while(R != 2) {
	    
    	//Pedindo os valores para o usuario
	
	   	System.out.printf("Entre com o elemento A: "); 
		int a = teclado.nextInt();
		        
        System.out.printf("Entre com o elemento B: ");	
        int b = teclado.nextInt();
		        
        System.out.printf("Entre com o elemento C: ");	
        int c = teclado.nextInt();
			       
		System.out.println("=============================");
	  
		MostrarFormula(a,b,c);
		
		// Calcula o descriminante e informa quantas raízes possui

		 delta = b*b - 4*a*c;
		 System.out.println("Δ = " + delta);
		 if (delta > 0) {
			 System.out.println("Equação possui dois resultados distintos reais:  ");
			 calcbhaskara(a,b,delta);		 
		 }
		 else if(delta < 0) {
			 System.out.println("A equação não possui resultado real. ");
		 }
		 else {
			 System.out.println("A equação possui apenas um resultado real: ");
			 calcbhaskara(a,b,delta);		 
		 }
		
		System.out.println("=============================");
		System.out.println(); 
		System.out.printf("Quer continuar? [1-S / 2-N] ");
	    R = teclado.nextInt();
	   	System.out.println();
	    
	    }
	    teclado.close(); 

		}
		//Metodo que calcula as raízes da equação
		public static void calcbhaskara(int a, int b, double delta) {
			double x;
			double xx;
			
			x = (-(b)+ Math.sqrt(delta)) / (2*a);
			xx = (-(b) - Math.sqrt(delta)) / (2*a); 
			
			if(x == xx) {
				System.out.println("x' , x'' = " + x);
					
			}else {
				System.out.println("x' = " + x);
				System.out.println("x'' = "+ xx);
			}
				
		}
		
		public static void MostrarFormula(int a, int b, int c) {
			if(a < 0 && b < 0 && c < 0) {
				System.out.println("Δ = "+b +"*("+b+ ") - 4*("+a+")*("+c+") = 0");

		    }else if(a < 0 && b < 0){
			    System.out.println("Δ = "+b +"*("+b+ ") - 4*("+a+")*"+c+" = 0");

		    }else if(a < 0 && c < 0) {
			    System.out.println("Δ = "+b +"*"+b+ " - 4*("+a+")*("+c+") = 0");
		    	
		    }else if (b < 0 && c < 0) {
			    System.out.println("Δ = "+b +"*("+b+ ") - 4*"+a+"*("+c+") = 0");

		    }else if (a < 0) {
			    System.out.println("Δ = "+b +"*"+b+ " - 4*("+a+")*"+c+" = 0");

			}else if (b < 0){
			    System.out.println("Δ = "+b +"*("+b+ ") - 4*"+a+"*"+c+" = 0");
			
		    }else if(c < 0) {
			    System.out.println("Δ = "+b +"*"+b+ " - 4*"+a+"*("+c+") = 0");

		    }else {
			    System.out.println("Δ = "+b +"*"+b+ " - 4*"+a+"*"+c+" = 0");

			}
		}
	}


