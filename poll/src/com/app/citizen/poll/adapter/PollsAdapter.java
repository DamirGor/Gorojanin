package com.app.citizen.poll.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.citizen.poll.R;
import com.app.citizen.poll.model.Poll;


import java.util.List;

/**
 * Created by ainurminibaev on 10.06.14.
 */
public class PollsAdapter extends BaseAdapter {
    public List<Poll> polls;
    private LayoutInflater inflater;

    public PollsAdapter(Context context, List<Poll> polls) {
        this.inflater = LayoutInflater.from(context);
        this.polls = polls;
    }

    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }

    @Override
    public int getCount() {
        return polls.size();
    }

    @Override
    public Poll getItem(int i) {
        return polls.get(i);
    }

    @Override
    public long getItemId(int i) {
        return polls.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.poll_item_n, viewGroup,
                    false);
            ViewHolder viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        Poll poll = getItem(i);
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.text.setText(poll.getName());
        holder.price.setText("+" + poll.getPrice());
        holder.date.setText("12.06.14");
        return view;
    }


    private class ViewHolder {
        TextView text;
        TextView price;
        ImageView ico;
        TextView date;


        public ViewHolder(View contentView) {
            text = (TextView) contentView.findViewById(R.id.poll_name);
            price = (TextView) contentView.findViewById(R.id.poll_price);
            ico = (ImageView) contentView.findViewById(R.id.poll_pic);
            date = (TextView) contentView.findViewById(R.id.poll_date);
        }

    }
}
