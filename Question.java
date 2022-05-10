package OneToOne_BiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
		@Id
		private int question_id;
		private String question;
		
		@OneToOne
		@JoinColumn(name = "answer_id")
		private Answer answer;

		Question()
		{
			
		}
		
		public int getQuestion_id() {
			return question_id;
		}

		public void setQuestion_id(int question_id) {
			this.question_id = question_id;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public Answer getAnswer() {
			return answer;
		}

		public void setAnswer(Answer answer) {
			this.answer = answer;
		}

		@Override
		public String toString() {
			return "Question [question=" + question + "]";
		}
		
}
