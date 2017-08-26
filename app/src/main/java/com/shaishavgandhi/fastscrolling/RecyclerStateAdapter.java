package com.shaishavgandhi.fastscrolling;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by shaishav.gandhi on 8/25/17.
 */

public class RecyclerStateAdapter extends RecyclerView.Adapter<StateViewHolder> {

    private List<State> data;

    public RecyclerStateAdapter(List<State> data) {
        this.data = data;
    }

    @Override
    public StateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View personCell = inflater.inflate(R.layout.list_item_state, parent, false);
        return new StateViewHolder(personCell);
    }

    @Override
    public void onBindViewHolder(StateViewHolder holder, int position) {
        holder.name.setText(data.get(position).getName());
        holder.location.setText(data.get(position).getLocation());
    }

    @Override
    public int getItemCount() {
        return data != null ? data.size() : 0;
    }
}
