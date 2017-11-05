package com.automation.training;
import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyHomework {
	
	@BeforeSuite
	public void imprimirAntesDeSuite(){
		System.out.println("BeforeSuite");
		
	}
	@BeforeTest
	public void imprimirAntesDeTest(){
		System.out.println("BeforeTest");
		
	}
	@BeforeClass
	public void imprimirAntesDeClase(){
		System.out.println("BeforeTest");
		
	}
	@BeforeMethod
	public void imprimirAntesDeMetodo(){
		System.out.println("BeforeMethod");
		
	}
	@AfterSuite
	public void imprimirDespuesDeSuite(){
		System.out.println("AfterSuite");
		
	}
	@AfterTest
	public void imprimirDespuesTest(){
		System.out.println("AfterTest");
		
	}
	@AfterClass
	public void imprimirDespuesDeClase(){
		System.out.println("AfterTest");
		
	}
	@AfterMethod
	public void imprimirDespuesDeMetodo(){
		System.out.println("AfterMethod");
		
	}
	
	@DataProvider(name="test1")
	public Object[][] createData1() {
		return new Object[][]{
			{new Integer(2),new Integer(3)},
			{new Integer(4),new Integer(5)},
			{new Integer(6),new Integer(7)}
		};
		
	}
	@DataProvider(name="test2")
	public String[][] createData2() {
		return new String[][]{
			{"Esta es la ","Historia de"," un programa muy bacano"},
			{"que funcionaba a las mil ","maravillas pero un dia", " se toteo"},
			{"porque se toteo?"," Quien sabe, quiza fue un punto"," y coma"},
			{"como asi??", " me pregunte:", " de quien fue la culpa?"}
	};
	}
	
	@Test(dataProvider= "test1",groups = { "Smoke", "Regression" })
	public void TestMultiplicarNumeros(Integer f1, Integer n1) {
		Integer resultado1=f1*n1;
		System.out.println(f1+"*"+n1+"="+resultado1);      
	}
	
	@Test(dataProvider= "test2",groups = { "Smoke", "Regression" })
	public void TestConcatenar(String w1, String w2, String w3) {
		String result=w1.concat(w2);		
		System.out.println(result+w3);      
	}
	
	
	@Parameters({ "fecha" })
	@Test(groups = { "Smoke" })
	public void TestGenerarFecha(String date1) {
		
		char[] date2=date1.toCharArray();
		String result =new String();
		for(int i=0;i<date2.length;i++){
			
			if(i==4 || i==7){
				
				String a="/";
				char[] b=a.toCharArray();
				date2[i]=b[0];
			}
			result=result+date2[i];			
		}		
		System.out.println(result);
		      
	}
	
	@Parameters({ "param1","param2" })
	@Test(groups = { "Smoke" })
	public void TestMultiplicacion2(String parametro1,String parametro2) {
		 int a=30;
		 int b=20;
		 int result=1;
		 int salida=0;
		 System.out.println ("Empezamos el programa");
	     System.out.println ("Por favor introduzca el nombre del parametro por teclado:");
	     String entradaTeclado = "";
	     Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	     entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
	     System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
	     while(salida==0){
	    	 
	     if(entradaTeclado.equals(parametro1)){
	      result=a*b;
	      System.out.println ("La multiplicacion de "+a+" y "+b+" es: "+result+"\n");
	      salida=1;
	     }
	     else if(entradaTeclado.equals(parametro2)){
	      result=a-b;
		  System.out.println ("La resta de "+a+" y "+b+" es: "+result+"\n");
		  salida=1;
	     
	     }
	     else{
	    	 System.out.println ("PARAMETRO INVALIDO\n");	    	 
	    	 
	     }
	     
	     }
		      
	}
	
	
	
	

}
