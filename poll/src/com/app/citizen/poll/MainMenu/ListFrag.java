package com.app.citizen.poll.MainMenu;

/**
 * Created by ramis on 6/9/14.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.app.citizen.poll.menu.PollsActivity;


public class ListFrag extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        String[] values = new String[]{"Опросы", "Мои баллы", "Профиль", "Новости", "О приложении"};
        // задаем массив куда будем выводить и что
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        // получаем позицию кликнутого элемента
        String item = (String) getListAdapter().getItem(position);
        switch (position) {
            case 0:
                Intent intent = new Intent(getActivity().getApplicationContext(), PollsActivity.class);
                startActivity(intent);
                break;
        }
        //вызываем интент и передаем на него параметр кликнутого елемента
     /*   Intent intent = new Intent(getActivity().getApplicationContext(), DetailActivity.class);
        intent.putExtra("value", item);
        startActivity(intent);
*/
    }
}