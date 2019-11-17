package www.ug.hibernet.hibernete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ClienteDao {

	
protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	
	protected void crear(Cliente cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(cliente);
		s.getTransaction().commit();
		s.close();
	}
	protected Cliente read(long clienteID) {
		Session s =  sessionFactory.openSession();
		Cliente cliente = s.get(Cliente.class, clienteID);
		s.close();
		return cliente;
	}
	
	protected void update(Cliente cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int clienteID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Cliente cliente = new Cliente();
		cliente.setId(clienteID);
		s.delete(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	

