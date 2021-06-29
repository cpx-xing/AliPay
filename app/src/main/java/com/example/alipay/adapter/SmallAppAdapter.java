package com.example.alipay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alipay.R;
import com.example.alipay.entity.SmallAppEntity;

import java.util.List;

public class SmallAppAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected Context mContext;
    protected List<SmallAppEntity> datas;

    public SmallAppAdapter(Context mContext, List<SmallAppEntity> datas) {
        this.mContext = mContext;
        this.datas = datas;
    }

    @Override
    public int getItemViewType(int position) {
        int type = datas.get(position).getType();
        return type;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1){
            View view = LayoutInflater.from(mContext).inflate(R.layout.small_app_one,parent,false);
            return  new ViewHolderOne(view);
        }else {
            View view2 = LayoutInflater.from(mContext).inflate(R.layout.small_app_two,parent,false);
            return new ViewHolderTwo(view2);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int type = getItemViewType(position);
        switch (type){
            case 1:
                ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
                break;
            case 2:
                ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
                break;
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
    public class ViewHolderOne extends RecyclerView.ViewHolder{
        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
        }
    }
    public class ViewHolderTwo extends RecyclerView.ViewHolder{
        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
        }
    }
}
