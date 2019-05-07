package org.helloworldmvc.model;
import java.io.*;
public class DAOHelloWorld {
	private static String FileName = "/fichier/TXT.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	public DAOHelloWorld() {
		
	}
	
	public static DAOHelloWorld getInstance() { 
		return instance;
	}
	
	private final void setInstance( DAOHelloWorld instance) { 
		this.instance=instance;
	}
	
	private void readFile() {
		try{
			   InputStream ips=new FileInputStream(FileName); 
			   InputStreamReader ipsr=new InputStreamReader(ips);
			   BufferedReader br=new BufferedReader(ipsr);
			   String ligne;
			   while ((ligne=br.readLine())!=null){
			    System.out.println(ligne);
			    
			   }
			   br.close(); 
			  }  
			  catch (Exception e){
			   System.out.println(e.toString());
			  }
	}
	
	public String getHelloWorldMessage() {
		return helloWorldMessage;
		
	}
	
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage=helloWorldMessage;
	}
}
