package com.example.alipay.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.amap.api.maps.MapView;
import com.example.alipay.R;
import com.example.alipay.activity.MapActivity;

public class KouBeiFragment extends Fragment implements View.OnClickListener {

private Button button;
    public KouBeiFragment() {
        // Required empty public constructor
    }

    public static KouBeiFragment newInstance() {
        KouBeiFragment fragment = new KouBeiFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_kou_bei, container, false);
        button = view.findViewById(R.id.gotomap);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gotomap:
                Intent intent = new Intent(getActivity(), MapActivity.class);
                startActivity(intent);
                break;
        }
    }
}