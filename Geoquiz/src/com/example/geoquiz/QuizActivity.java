package com.example.geoquiz;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {

	private Button mTrueButton;
	private Button mFalseButton;
	private Button mNextButton;
	private TextView mQuestionTextView;
	private TextView mCounterTextView;
	private TrueFalse[] mQuestionBank = new TrueFalse[]{
			new TrueFalse(R.string.question_africa,true),
			new TrueFalse(R.string.question_americas,false),
			new TrueFalse(R.string.question_asia,false),
			new TrueFalse(R.string.question_mideast,true),
			new TrueFalse(R.string.question_ocean,true)
	};
	private int mCurrentIndex = 0;
	private int mTrueIndex = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        
        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        mCounterTextView = (TextView)findViewById(R.id.true_counter);
        updateQuestion();
        updateCounter();
        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				checkAnswer(true);
				mCurrentIndex = (mCurrentIndex +1)% mQuestionBank.length;
				updateQuestion();
				updateCounter();
			}
		});
        
        mFalseButton = (Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				checkAnswer(false);
				mCurrentIndex = (mCurrentIndex +1)% mQuestionBank.length;
				updateQuestion();
				updateCounter();
			}
		});
        
        mNextButton = (Button)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mCurrentIndex = (mCurrentIndex +1)% mQuestionBank.length;
				updateQuestion();
			}
		});
        
    }

    private void updateQuestion(){
    	int question = mQuestionBank[mCurrentIndex].getQuestion();
		mQuestionTextView.setText(question);
    }
    
    private void updateCounter(){
    	mCounterTextView.setText("Right answers : "+ mTrueIndex);
    }
    
    private void checkAnswer(boolean userPressesTrue)
    {
    	boolean isTrueQuestion = mQuestionBank[mCurrentIndex].isTrueQuestion();
    	int messageID = 0;
    	if(isTrueQuestion == userPressesTrue){
    		messageID = R.string.correct_toast;
    		mTrueIndex =  mTrueIndex +1;
    	}
    	else{
    		messageID = R.string.incorrect_toast;
    	}
    	
    	Toast.makeText(QuizActivity.this, messageID, Toast.LENGTH_LONG).show();
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;
    }
    
}
