package com.app.citizen.poll;

/**
 * Created by ramis on 6/9/14.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //так же здесь можно переопределять елементы, findViewByID и остальное делается так view.findViewById...
        View view = inflater.inflate(R.layout.details, container, false);
        return view;
    }

    //получаем параметр и передаем в текствью
    public void setText(String item) {
        TextView view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(item);
    }
}