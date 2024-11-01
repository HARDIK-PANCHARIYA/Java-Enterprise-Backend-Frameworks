package com.core.mapping;

import javax.persistence.*;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int qid;
	String que;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aid")
	Answer answer;




	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Question(String que, Answer answer) {
		super();
		this.que = que;
		this.answer = answer;
	}



	public int getQid() {
		return qid;
	}



	public void setQid(int qid) {
		this.qid = qid;
	}



	public String getQue() {
		return que;
	}



	public void setQue(String que) {
		this.que = que;
	}



	public Answer getAnswer() {
		return answer;
	}



	public void setAnswer(Answer answer) {
		this.answer = answer;
	}



	@Override
	public String toString() {
		return "Question [qid=" + qid + ", que=" + que + ", answer=" + answer + "]";
	}



	
	
	
	
	
	

}
