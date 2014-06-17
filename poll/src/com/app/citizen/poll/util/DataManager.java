package com.app.citizen.poll.util;



import com.app.citizen.poll.model.Poll;
import com.app.citizen.poll.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ainurminibaev on 10.06.14.
 */
public class DataManager {
    private HashMap<Integer, Poll> polls;

    private DataManager() {
        polls = new HashMap();

        //добавляем опрос 1
        Poll poll = new Poll();
        poll.setId(0);
        poll.setName("Какие города лучше?");
        poll.setPrice(10);
        //вопрос 1
        Question question1 = new Question();
        question1.setOrder(0);
        question1.setQuestion("Сколько вам лет?");
        question1.setPossAnswers(Arrays.asList("21", "12", "32", "50"));
        //вопрос 2
        Question question2 = new Question();
        question2.setOrder(1);
        question2.setQuestion("Из какого вы района?");
        question2.setPossAnswers(Arrays.asList("Авиастроительный", "Вахитовский", "Кировский", "Московский"));

        ArrayList<Question> arrayList = new ArrayList();
        arrayList.add(question1);
        arrayList.add(question2);
        poll.setQuestions(arrayList);
        polls.put(0, poll);
        //конец добавляем опрос 1

        //добавляем опрос 2
        Poll poll1 = new Poll();
        poll1.setId(1);
        poll1.setName("Какой район лучше?");
        poll1.setPrice(15);
        //вопрос 1
        Question question21 = new Question();
        question21.setOrder(1);
        question21.setQuestion("Сколько вам лет?");
        question21.setPossAnswers(Arrays.asList("21", "12", "32", "50"));
        //вопрос 2
        Question question22 = new Question();
        question22.setOrder(0);
        question22.setQuestion("Из какого вы района?");
        question22.setPossAnswers(Arrays.asList("Авиастроительный", "Вахитовский", "Кировский", "Московский"));

        ArrayList<Question> arrayList2 = new ArrayList<Question>();
        arrayList2.add(question22);
        arrayList2.add(question21);
        poll1.setQuestions(arrayList2);
        polls.put(1, poll1);
        //конец добавляем опрос 2

        //далее по примеру
    }

    private static class Holder {
        private static final DataManager INSTANCE = new DataManager();
    }

    public static DataManager get() {
        return Holder.INSTANCE;
    }

    public List<Poll> getPolls() {
        ArrayList<Poll> list = new ArrayList();
        list.addAll(polls.values());
        return list;
    }

    public Poll getById(int id) {
        return polls.get(id);
    }
}
