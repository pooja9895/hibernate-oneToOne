package AddressBranch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		// setting values to branch class
		Branch branch=new Branch();
		branch.setName("bangalore");
		
		// setting values to address class
		Address address=new Address();
		address.setState("karnataka");
		branch.setAddress(address);
		
		et.begin();
		em.persist(branch);
		em.persist(address);
		et.commit();
	
		Branch br = em.find(Branch.class,1);
		System.out.println("---------  Branch ----------");
		System.out.println("branch id is  :"+br.getId());
		System.out.println("branch name is : "+br.getName());
		System.out.println("branch address is  :"+br.getAddress());
		
		
		Address ad=em.find(Address.class, 1);
		System.out.println("---------  Address ----------");
		System.out.println("address id is : "+ad.getId());
		System.out.println("state is  :"+ad.getState());

	
		
	}

}
