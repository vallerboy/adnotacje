package pl.akademiakodu.maven;

import java.lang.reflect.Method;

public class Main {
 
	static boolean userHasInternet = false; 
	
	public static void main(String[] args) {
	  
		System.out.println("Witaj w naszej aplikacji!");
	    App mojaKlasa = new App(); 
	    
	      for(Method metoda : mojaKlasa.getClass().getDeclaredMethods()){
	    	  if(metoda.isAnnotationPresent(InfoAdno.class)){
	    		
	    		  InfoAdno mojaAdnotacja = metoda.getAnnotation(InfoAdno.class);
	    		 // System.out.println("Metoda: " + metoda.getName());
	    		 // System.out.println("isUsingInternet: " + mojaAdnotacja.isUsingInternet());
	    		  if(mojaAdnotacja.isUsingInternet()){
	    			  if(!userHasInternet){
	    				  System.out.println("Przykro mi, nie masz dostępu do internetu!");
	    			  }
	    		  }
	    	  }
	      }
	    	 
	    

	}

}
