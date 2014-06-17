package com.app.citizen.poll.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.app.citizen.poll.R;
import com.app.citizen.poll.model.Poll;
import com.app.citizen.poll.model.Question;
import com.app.citizen.poll.util.DataManager;

import java.util.List;


/**
 * Created by ainurminibaev on 12.06.14.
 */
public class VoteFragment extends Fragment {

    RadioButton[] cases;
    TextView questionText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Intent intent = getActivity().getIntent();
        Bundle extras = null;
        if (intent != null) {
            extras = intent.getExtras();
        }
        if (extras != null) {
            int pollId = extras.getInt("pollId");
            Poll poll = DataManager.get().getById(pollId);
            List<Question> questions = poll.getQuestions();
            Question question1 = questions.get(0);
            questionText.setText(question1.getQuestion());
            for (int i = 0; i < cases.length; i++) {
                if (i < question1.getPossAnswers().size()) {
                    String answer = question1.getPossAnswers().get(i);
                    cases[i].setText(answer);
                }
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //так же здесь можно переопределять елементы, findViewByID и остальное делается так view.findViewById...
        View view = inflater.inflate(R.layout.vote_frag, container, false);
        cases = new RadioButton[2];
        cases[0] = (RadioButton) view.findViewById(R.id.case1);
        cases[1] = (RadioButton) view.findViewById(R.id.case2);
        questionText = (TextView) view.findViewById(R.id.question_text);
        return view;
    }
}
