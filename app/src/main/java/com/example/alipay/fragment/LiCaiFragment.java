package com.example.alipay.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alipay.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LiCaiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiCaiFragment extends Fragment {
    public LiCaiFragment() {
    }

    public static LiCaiFragment newInstance() {
        LiCaiFragment fragment = new LiCaiFragment();
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
        return inflater.inflate(R.layout.fragment_li_cai, container, false);
    }
}