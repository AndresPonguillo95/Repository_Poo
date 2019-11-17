package www.ug.hibernet.hibernete;

import java.util.Date;

public class App 


{
	
	
	public static void imprimir(String message) {
		
		System.out.println(message);
	}
    public static void main( String[] args ) {
    	
    crear();
	read();
	update();
	read();
	delete();
	
    }
    
    	public static void crear() {
    	ClienteDao daoCliente = new ClienteDao();
    	Cliente cliente = new Cliente(1,"Melissa","Tello",new Date(),'I',"soltera");
		daoCliente.setup();
		daoCliente.crear(cliente);
		Cliente cliente2 = new Cliente(2,"Katherine","Arias",new Date(),'A',"Casada");
		daoCliente.crear(cliente2);  
		Cliente cliente3 = new Cliente(3,"Edwin","Barcia",new Date(),'I',"Divorciado");
		daoCliente.crear(cliente3);   
		Cliente cliente4 = new Cliente(4,"Claudia","Anzules",new Date(),'A',"Vacilando");
		daoCliente.crear(cliente4);   
        
    }
    	
    	
    	public static void read() {
    		ClienteDao daoCliente = new ClienteDao();
    		daoCliente.setup();
    		Cliente cliente = daoCliente.read(22);
    		
    		imprimir(cliente.toString());
  	}
        public static void update() {

    		ClienteDao daoCliente = new ClienteDao();
    		daoCliente.setup();
    		Cliente cliente = daoCliente.read(21);
    		cliente.setNombres("Roberto");
    		cliente.setApellido("Rodriguez");
    		daoCliente.update(cliente);
   	}
    		
    	public static void delete() {
    		ClienteDao daoCliente = new ClienteDao();
    		daoCliente.setup();
    		daoCliente.delete(28);
    	
    	}
    
}
