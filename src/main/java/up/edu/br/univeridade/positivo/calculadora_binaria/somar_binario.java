package up.edu.br.univeridade.positivo.calculadora_binaria;

import java.util.ArrayList;
import java.util.Scanner;

public class somar_binario {
	
	public static void main( String[] args )
    {
	  String n1 = "";
	  String n2 = "";
	  int tamanho = 0;
	  int subiu = 0;
	  String laEmCima = "";
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
    	  if(subiu != 0 && numero2.size() >= i+1 ) {
    		  if(numero1.get(i) == 1 ) {
    			  if(numero2.get(i) == 0) {
    				  resultado.add(0);
    			  }else {
    				  resultado.add(1);
    			  }
	    		  subiu = 1;
	    		  laEmCima += "1";
	    	  }else if(numero1.get(i) == 0) {
	    		  
	    		  if(numero2.get(i) == 0) {
    				  resultado.add(1);
    				  subiu = 0;
    				  laEmCima += " ";
    			  }else {
    				  resultado.add(0);
    				  subiu = 1;
    				  laEmCima += "1";
    			  }
	    	  }
    		  
    	  }else if(subiu != 0  && numero2.size() < i+1 ) {
    		  if(numero1.get(i) == 1 ) {
    			    resultado.add(0);
	    		    subiu = 1;
	    		    laEmCima += "1";
	    	  }else if(numero1.get(i) == 0) {
    				  resultado.add(1);
    				  subiu = 0;
    				  laEmCima += " ";
	    	  }
    	  }else {
	    	  if(numero1.size() >= i+1 && numero2.size() >= i+1 ) {
		    	  if(numero1.get(i) == 1 && numero2.get(i) == 1 ) {
		    		  resultado.add(0);
		    		  subiu = 1;
		    		  laEmCima += "1";
		    	  }else if(numero1.get(i) == 0 && numero2.get(i) == 1 || numero1.get(i) == 1 && numero2.get(i) == 0 ) {
		    		  resultado.add(1);
		    		  laEmCima += " ";
		    	  }else {
		    		  resultado.add(0);
		    		  laEmCima += " ";
		    	  }
	    	  }
	    	  
	    	  if(numero1.size() < i+1) {
	    		  resultado.add(numero2.get(i));
	    		  laEmCima += " ";
	    	  }else if(numero2.size() < i+1) {
	    		  resultado.add(numero1.get(i));
	    		  laEmCima += " ";
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
	  String laEmCimaReverso = "";
	  for (int i = laEmCima.length() - 1;  0 <= i; i--) {
		  laEmCimaReverso += laEmCima.charAt(i);
	    }
	  System.out.println(" ");
	  System.out.println(laEmCimaReverso);
	  System.out.println(" "+n1);
	  System.out.println(espaço + n2);
	  System.out.println(linha+"_");
	  
	  if(subiu != 0) {
		  System.out.println(" "+ "1"+saida2);
	  }else {
		  System.out.println(" "+ saida2);
	  }
     
    }
}
