package com.example.geoquiz;
public class TrueFalse {
	private int mQuestion;
	private boolean mTrueQuestion;
	
	/*
	 * constructor for TrueFalse class
	 */
	public TrueFalse(int question,boolean trueQuestion)
	{
		this.setQuestion(question);
		this.setTrueQuestion(trueQuestion);
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}
	
}
