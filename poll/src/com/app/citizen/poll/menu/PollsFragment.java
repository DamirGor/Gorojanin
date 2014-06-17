package com.app.citizen.poll.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;
import com.app.citizen.poll.activity.VoteActivity;
import com.app.citizen.poll.adapter.PollsAdapter;
import com.app.citizen.poll.model.Poll;
import com.app.citizen.poll.util.DataManager;


import java.util.List;

/**
 * Created by ramis on 6/10/14.
 */
public class PollsFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        String[] values = new String[]{"Опросы", "Опросы", "Опросы", "Опросы", "Опросы"};
        //TODO пример использования
        List<Poll> polls = DataManager.get().getPolls();
        setAdapterData(polls);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void setAdapterData(List<Poll> polls) {
        if (getListAdapter() == null) {
            setListAdapter(new PollsAdapter(getActivity(), polls));
            getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    System.out.println("Clicked: " + i);
                    Poll poll = getListAdapter().getItem(i);
                    Intent intent = new Intent(getActivity().getApplicationContext(), VoteActivity.class);
                    intent.putExtra("pollId", poll.getId());
                    startActivity(intent);
                }
            });
        } else {
            getListAdapter().setPolls(polls);
        }
    }

    @Override
    public PollsAdapter getListAdapter() {
        return (PollsAdapter) super.getListAdapter();
    }
}
