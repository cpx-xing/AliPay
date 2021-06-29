package com.example.alipay.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.alipay.R;
import com.example.alipay.adapter.ImageBannerAdapter;
import com.example.alipay.adapter.MyGridItemAdapter;
import com.example.alipay.adapter.SmallAppAdapter;
import com.example.alipay.bean.DataBean;
import com.example.alipay.entity.GridItemEntity;
import com.example.alipay.util.DataUtil;
import com.google.android.material.snackbar.Snackbar;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.util.LogUtils;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private Context mContext;
    private ArrayList<GridItemEntity> data = null;
    private GridView gridViewtop;
    private GridView gridView;
    private MyGridItemAdapter mAdapter;
    private MyGridItemAdapter gridTopAdapter;
    private Banner banner;
    private ImageBannerAdapter adapter;
    private RecyclerView recyclerView;
    private SmallAppAdapter smallAppAdapter;
    private SmartRefreshLayout smartRefreshLayout;

    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mContext = getContext();
        gridView = view.findViewById(R.id.gird_item);
        gridViewtop = view.findViewById(R.id.gird_top);
        banner = view.findViewById(R.id.banner);
        recyclerView = view.findViewById(R.id.recyclerview);
        smartRefreshLayout = view.findViewById(R.id.refreshLayout);

//        小程序网格布局添加数据
        data = new ArrayList<>();
        List<GridItemEntity> list = DataUtil.getGridItem();
        data.addAll(list);
        mAdapter = new MyGridItemAdapter(data,mContext);
        gridView.setAdapter(mAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),data.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

//        顶部常用功能添加数据
        gridTopAdapter = new MyGridItemAdapter(DataUtil.getGridTop(),mContext);
        gridViewtop.setAdapter(gridTopAdapter);
        gridViewtop.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),DataUtil.getGridTop().get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

        //        给banner添加数据
        adapter = new ImageBannerAdapter(DataBean.getTestData2(), getContext());
        banner.setAdapter(adapter)
                .setScrollTime(500)
                .setLoopTime(6000)
                .addBannerLifecycleObserver(this)//添加生命周期观察者
                .setIndicator(new CircleIndicator(getContext()))//设置指示器
                .setOnBannerListener((data, position) -> {
                    Snackbar.make(banner, ((DataBean) data).title, Snackbar.LENGTH_SHORT).show();
                    LogUtils.d("position：" + position);
                });

//        给小面的小程序添加数据
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        smallAppAdapter = new SmallAppAdapter(getContext(),DataUtil.getSmallApp());
        recyclerView.setNestedScrollingEnabled(false);
        Toast.makeText(getContext(),DataUtil.getSmallApp().size()+"个",Toast.LENGTH_SHORT).show();
        recyclerView.setAdapter(smallAppAdapter);


//        刷新功能
        smartRefreshLayout.setRefreshHeader(new ClassicsHeader(getContext()));
        smartRefreshLayout.setRefreshFooter(new ClassicsFooter(getContext()));
        smartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(1000/*,false*/);//传入false表示刷新失败
            }
        });
        smartRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadMore(1000/*,false*/);//传入false表示加载失败
            }
        });

        return view;
    }
}