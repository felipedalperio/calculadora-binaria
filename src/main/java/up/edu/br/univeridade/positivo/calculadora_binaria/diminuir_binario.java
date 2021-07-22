package up.edu.br.univeridade.positivo.calculadora_binaria;

import java.util.ArrayList;
import java.util.Scanner;

public class diminuir_binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String n1 = "";
		  String n2 = "";
		  int tamanho = 0;
		  int desceu = 0;
		  String laEmBaixo = "";
		  String linha = "";
		  
		  ArrayList<Integer> n1vetor = new ArrayList<Integer>();
		  ArrayList<Integer> n2vetor = new ArrayList<Integer>();
		  ArrayList<Integer> resultado = new ArrayList<Integer>();
		  
		  ArrayList<Integer> numero1 = new ArrayList<Integer>();
		  ArrayList<Integer> numero2 = new ArrayList<Integer>();
		  
		  String res1 = "";
		  String res2 = "";
		  
		  Scanner ler = new Scanner(System.in);
		  
		  System.out.println("Informe o maior numero binario");
	      n1 = ler.nextLine();
	      
	      ler = null;
	      ler = new Scanner(System.in);
		  System.out.println("Informe o menor numero binario");
	      n2 = ler.nextLine();
	      

	      String[] frasen1 = n1.split("");
	      String[] frasen2 = n2.split("");
	      
	      for(String n11 : frasen1) {
	    	  n1vetor.add(Integer.parseInt(n11));
	      }
	      
	      for(String n22 : frasen2) {
	    	  n2vetor.add(Integer.parseInt(n22));
	      }
	      
	      //INVERTENDO
	      
		  for ( int i =  n1vetor.size() - 1 ; i >= 0 ; i-- ) {
			  res1 += n1vetor.get(i);
	          numero1.add(n1vetor.get(i));
	          linha+= "_";
		
		   }
		   
		   for ( int i =  n2vetor.size() - 1 ; i >= 0 ; i-- ) {
			    res2 += n2vetor.get(i);
		        numero2.add(n2vetor.get(i));
			
			}
			   	   
		
	      if(numero1.size() >= numero2.size() ) {
	    	  tamanho = n1vetor.size();
	      }else {
	    	  tamanho = n2vetor.size();
	      }
	      
	      
	      //CALCULO:
	      for(int i = 0; i < tamanho; i++) {
	       	  if(desceu != 0 && numero2.size() >= i+1 ) {
	    		  if(numero1.get(i) == 1 ) {
	    			  if(numero2.get(i) == 0) {
	    				  resultado.add(0);
	    				  desceu = 0;
			    		  laEmBaixo += " ";
	    			  }else {
	    				  resultado.add(1);
	    				  desceu = 1;
			    		  laEmBaixo += "1";
	    			  }
		    		 
		    	  }else if(numero1.get(i) == 0) {
		    		  
		    		  if(numero2.get(i) == 0) {
	    				  resultado.add(1); 
	    			  }else {
	    				  resultado.add(0);
	    				
	    			  }
		    		  desceu = 1;
		    		  laEmBaixo += "1";
		    	  }
	    		  
	    	  }else if(desceu != 0  && numero2.size() < i+1 ) {
	    		  if(numero1.get(i) == 1 ) {
	    			    resultado.add(0);
	    			      desceu = 0;
	    				  laEmBaixo += " ";
		    	  }else if(numero1.get(i) == 0) {
	    				  resultado.add(1);
	    				  desceu = 1;
	    				  laEmBaixo += "1";
		    	  }
	    	  }
	    	  else {
		    	  if(numero1.size() >= i+1 && numero2.size() >= i+1 ) {
			    	  if(numero1.get(i) == 1 && numero2.get(i) == 1 ) {
			    		  resultado.add(0);
			    		  laEmBaixo += " ";
			    		  desceu = 0;
			    	  }else if(numero1.get(i) == 0 && numero2.get(i) == 1 ) {
			    		  resultado.add(1);
			    		  laEmBaixo += "1";
			    		  desceu = 1;
			    	  }else if(numero1.get(i) == 1 && numero2.get(i) == 0) {
			    		  resultado.add(1);
			    		  laEmBaixo += " ";
			    		  desceu = 0;
			    	  }else {
			    		  resultado.add(0);
			    		  laEmBaixo += " ";
			    		  desceu = 0;
			    	  }
		    	  }
		    	  
		    	  if(numero1.size() < i+1) {
		    		  resultado.add(numero2.get(i));
		    		  laEmBaixo += " ";
		    	  }else if(numero2.size() < i+1) {
		    		  resultado.add(numero1.get(i));
		    		  laEmBaixo += " ";
		    	  }
	    	  }
	    	  
	    	 
	      }
	    	  
	      
	      
	      String saida2 = "" ;
	      
		  for ( int i =  resultado.size() - 1 ; i >= 0 ; i-- ) {
		
	         saida2 += String.valueOf(resultado.get(i));
		
		   }
		  
		  //numero de espaços:
		  int cont = numero1.size() - numero2.size();
		  String espaço = "";
		  for(int i = 0; i<= cont; i++ ) {
			  espaço += " ";
		  }
		  //invertendo subida:
		  String laEmBaixoReverso = "";
		  for (int i = laEmBaixo.length() - 1;  0 <= i; i--) {
			  laEmBaixoReverso += laEmBaixo.charAt(i);
		    }
		  System.out.println(" ");
		  System.out.println(laEmBaixoReverso);
		  System.out.println(" "+n1);
		  System.out.println(espaço + n2);
		  System.out.println(linha+"_");
		  
		  if(desceu != 0) {
			  System.out.println(" "+ "1"+saida2);
		  }else {
			  System.out.println(" "+ saida2);
		  }
	     
	    }

}
