package pl.akademiakodu.maven;



public  class App 
{
	//@InfoAdno(getInfo = "Jakaś skromna informacja")
	int oskar = 0;

	
    @InfoAdno(isUsingInternet = true)
    public void testAdd() {
    	// ta będzie używać internetu
    }
    
    @InfoAdno(isUsingInternet = true)
    public void run() {
    	// ta nie będzie używać internetu
    }
    
    public void runOnce() { 
    	// metoda bez adnotacji
    }
    
    
 

}
