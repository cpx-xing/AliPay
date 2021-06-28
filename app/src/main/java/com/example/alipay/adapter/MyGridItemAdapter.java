package com.example.alipay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alipay.R;
import com.example.alipay.entity.GridItemEntity;

import java.util.ArrayList;
import java.util.List;

public class MyGridItemAdapter extends BaseAdapter {

   private List<GridItemEntity> data = new ArrayList<>();
   private Context mContext;

    public MyGridItemAdapter(List<GridItemEntity> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_grid_icon,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.img_icon);
            viewHolder.textView = convertView.findViewById(R.id.text_icon);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(data.get(position).getName());
        viewHolder.imageView.setImageResource(data.get(position).getmImageId());
        return convertView;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView textView;
    }

}
