package com.automation.training;
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
	
	
	
	
	

}
