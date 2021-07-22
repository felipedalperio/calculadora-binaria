package up.edu.br.univeridade.positivo.calculadora_binaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String continuar = "s";
    	 int n = 1;
    	 Scanner ler = new Scanner(System.in);
    	while(continuar.equalsIgnoreCase("s")) {
    		ler = new Scanner(System.in);
	        int[] tabela = {1,2,4,8,16,32,64,128,256,512,1024};
	        int posicaoTabela = 0;
	        boolean maior1024 = false;
	        boolean numeroIgual = false;
	        
	        System.out.println("Informe o número em decimal");
	        n = ler.nextInt();
	        int cont = 0;
	        while(true) {
	        	if(n <= tabela[cont]) {
	        		posicaoTabela = cont;
	        		if(n == tabela[cont] ) {
	        			numeroIgual = true;
	        		}
	        		break;
	        	}
	        	if(n >= 1024) {
	        		posicaoTabela = 12;
	        		maior1024 = true;
	        		break;
	        	}
	        	cont++;
	        }
	        //
	        String b = "";
	        cont = 1;
	        int j = 3;
	        int t = 2;
	        int resultado = 0;
	        int numeross = 0;
	        int resultado2 = 0;
	        boolean passou = false;
	        int penultimoResultado = 0;
	  
	        if(!maior1024 && !numeroIgual  ) {
	        	numeross = cont + 1;
	            resultado =  tabela[posicaoTabela  -1] + tabela[posicaoTabela  -numeross];
	            System.out.println(tabela[posicaoTabela  -1] + " + " + tabela[posicaoTabela  -numeross] + " = " +resultado); 
	        	while(true) {
	        		resultado2 = resultado;
		            if(resultado > n && resultado != n) {
		            	 numeross = j;
		            	 b += "0";
		            	 int pResultdado = tabela[posicaoTabela -1];
		            	 if(passou == true) {
		            		 pResultdado = penultimoResultado;
	       
		            	 }
		            	 resultado = pResultdado  + tabela[posicaoTabela  -numeross];
		            	 System.out.println(pResultdado + " + " + tabela[posicaoTabela  -numeross] + " = " +resultado); 
		            }else if(resultado < n && resultado != n){
		            	passou = true;
		            	b += "1";
		            	numeross = j;
		            	penultimoResultado = resultado;
		            	resultado = resultado  + tabela[posicaoTabela  -numeross];
		           	    System.out.println(resultado2 + " + " + tabela[posicaoTabela  -numeross] + " = " +resultado); 
		            }else {
		            	break;
		            }
		            j ++;
		           
	        	}
	            
	        }else {
	        	numeross = cont;
	            resultado =  tabela[posicaoTabela] + tabela[posicaoTabela  -numeross];
	            System.out.println(tabela[posicaoTabela] + " + " + tabela[posicaoTabela  -numeross] + " = " +resultado); 
	        	while(true) {
	        		resultado2 = resultado;
		            if(resultado > n && resultado != n) {
		            	 numeross = t;
		            	 b += "0";
		            	 int pResultdado = tabela[posicaoTabela -1];
		            	 if(passou == true) {
		            		 pResultdado = penultimoResultado;
	       
		            	 }
		            	 resultado = pResultdado  + tabela[posicaoTabela  -numeross];
		            	 System.out.println(pResultdado + " + " + tabela[posicaoTabela  -numeross] + " = " +resultado); 
		            }else if(resultado < n && resultado != n){
		            	passou = true;
		            	b += "1";
		            	numeross = t;
		            	penultimoResultado = resultado;
		            	resultado = resultado  + tabela[posicaoTabela  -numeross];
		           	    System.out.println(resultado2 + " + " + tabela[posicaoTabela  -numeross] + " = " +resultado); 
		            }else {
		            	break;
		            }
		            t ++;
		           
	        	}
	        }
	        int numeroParou = tabela[posicaoTabela  -numeross];
	        int r = 0;
	        String bf = "";
	        while(true) {
	            if( numeroParou == 1) {
	            	 break;
	            }
	        	if(numeroParou == 2) {
	        		bf += "0";
	        		break;
	        	}else {
	        		r = numeroParou/2;
	        		numeroParou = r;
	        		bf += "0";
	        	}
	        }
	        
	        System.out.println("Binario: 1" + b + "1"+bf);
	        System.out.println();
	        System.out.println("DESEJA CONTINUAR?");
	        continuar = ler.next();
    	}
        
        System.out.println();
        System.out.println("=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("SOMAR DIGITE 1");
        System.out.println("DIMINUIR DIGITE 2");
        System.out.println();
        System.out.println("=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        n = ler.nextInt();
        if(n == 1) {
        	somar_binario sm = new somar_binario();
        	sm.main(args);
        }
        if(n == 2) {
        	diminuir_binario dm = new diminuir_binario();
        	dm.main(args);
        }
        
    }
}
