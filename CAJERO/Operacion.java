package CAJERO;

import java.awt.peer.ListPeer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Operacion {

	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
        int opc ;
        
        System.out.println("**********MENU MANTENIMIENTO************\n");
       	
       	System.out.println("\n1. INICIAR CAJERO");

       	System.out.println("\n2. APAGAR CAJERO");
       	
               		
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        	
     System.out.print("\nSELECCIONE OPCION : ");
        	opc = Integer.parseInt(k.readLine());

        	      switch (opc) {
        	      
        		case 1:
        			   System.out.println ("\nDIGITE SU CLAVE:"+ "");
			                Clave c1 = new Clave();
			                    double Clave = Double.parseDouble(k.readLine());
				                   c1.setClave(Clave);
				    
					
							
				 break;
							
        		case 2:
             	       System.out.print("\nDIGITE SU CLAVE: "+""); 
             	           apagar b = new apagar();
        				       double apagar = Double.parseDouble(k.readLine());
        				           b.setapagar(apagar);
        					
        		 break;
        		 
        	      }
        	      System.out.println("**********MENU USUARIO************\n");
        	    	       	
        	    	       	System.out.println("\nIntrodusca su tarjeta");

        	    	       	
        	    	        System.out.println ("\nDIGITE SU CLAVE: "+"");
        	    	          
                                       Clave c1 = new Clave();
                                           double Clave = Double.parseDouble(k.readLine());
                                           
	                                              c1.setClave(Clave);
	                                              
	                                              System.out.println("\n\n1. RETIRO");

	                                             	System.out.println("\n\n2. TRANSFERENCIA");
	                                             	
	                                              System.out.print("\nSELECCIONE OPCION : "+"");
	                                                 	opc = Integer.parseInt(k.readLine());

	                                                 	      switch (opc) {
	                                                 	      
	                                                 		case 1:
	                                                 			   System.out.println ("\nDIGITE MONTO: "+"");
	                                                 			 apagar  b1 = new apagar();
                                            				       double apagar = Double.parseDouble(k.readLine());
                                            				           b1.setapagar(apagar);
																break;
	                                         							
	                                                 		case 2:
	                                                      	       System.out.print("\nDIGITE NUMERO DE CUENTA: "+""); 
	                                                      	           apagar b2 = new apagar();
	                                                 				       double apagar1 = Double.parseDouble(k.readLine());
	                                                 				           b2.setapagar(apagar1);
	                                                 					
	                                                 		 break;
	                                                 		 
	                                                 	      }
	}
}
	
	
	


        
	


