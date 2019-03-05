package com.example.applications;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class AdapterRecycle extends RecyclerView.Adapter<AdapterRecycle.DataViewHolder>
{
    private List<ListDataModel> modelClassList;

    public AdapterRecycle(List<ListDataModel> modelClassList) {
        this.modelClassList = modelClassList;
    }


    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.listitem,viewGroup,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder dataViewHolder, int i) {
        ListDataModel data = modelClassList.get(i);
        dataViewHolder.img.setImageResource(data.getList_Image());
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }
    public class DataViewHolder extends RecyclerView.ViewHolder {

        ImageView img;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.List_Image);

        }
    }

}
