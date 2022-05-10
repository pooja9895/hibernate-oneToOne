package OneToOne_BiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int answer_id;
	private String answer;
	
	// in question table,  we have column for answer id.
	// so here, the question is getting mapped to answer
							//or
	// which class dont have join column annotation, to that we add mapped by annotation
	@OneToOne(mappedBy = "answer")
	Question question;
	
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [answer=" + answer + "]";
	}
	
	
	
}
