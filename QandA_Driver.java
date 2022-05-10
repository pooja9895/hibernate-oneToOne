package OneToOne_BiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class QandA_Driver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction et = manager.getTransaction();

		
		Question q = new Question();
		q.setQuestion_id(1);
		q.setQuestion("What is a keyword ");
	
		Answer a = new Answer();
		a.setAnswer_id(111);
		a.setAnswer("Predefined words");

		q.setAnswer(a);
		a.setQuestion(q);

		et.begin();
		manager.persist(q);
		manager.persist(a);
		et.commit();


//		Question quest = manager.find(Question.class, 01);
//		System.out.println("------------------------------------------------------------");
//		System.out.println("question id : " + quest.getQuestion_id());
//		System.out.println("question  : " + quest.getQuestion());
//		System.out.println("answer  : " + quest.getAnswer());

//		Answer ans=manager.find(Answer.class, 111);
//		System.out.println("------------------------------------------------------------");
//		System.out.println("answer id : " + ans.getAnswer_id());
//		System.out.println("answer  : " + ans.getAnswer());
//		System.out.println("question  : " + ans.getQuestion());
	}
}
