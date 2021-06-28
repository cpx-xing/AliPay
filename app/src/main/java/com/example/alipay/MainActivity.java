package com.example.alipay;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.alipay.activity.BaseActivity;
import com.example.alipay.adapter.MyPagerAdapter;
import com.example.alipay.entity.TabEntity;
import com.example.alipay.fragment.HomeFragment;
import com.example.alipay.fragment.KouBeiFragment;
import com.example.alipay.fragment.LiCaiFragment;
import com.example.alipay.fragment.MessageFragment;
import com.example.alipay.fragment.MineFragment;
import com.example.alipay.view.FixedViewPaper;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {



    private FixedViewPaper viewPaper;
    private CommonTabLayout commonTabLayout;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();

// 底部的标签栏
    private String[] mTitles = {"首页","理财","口碑","消息","我的"};
//点击前的图标
    private int[] mIconUnselectIds = {
            R.mipmap.zhifubao0,R.mipmap.qian1,R.mipmap.koubei0,R.mipmap.xiaoxi1,R.mipmap.wode1
};
//    点击后的图标
    private  int[] mIconSelectIds = { R.mipmap.zhifubao,R.mipmap.qian2,R.mipmap.koubei1,R.mipmap.xiaoxi2,R.mipmap.wode2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void initView() {
        super.initView();
        viewPaper = findViewById(R.id.viewpaper);
        commonTabLayout = findViewById(R.id.commonTabLayout);

        mFragments.add(HomeFragment.newInstance());
        mFragments.add(LiCaiFragment.newInstance());
        mFragments.add(KouBeiFragment.newInstance());
        mFragments.add(MessageFragment.newInstance());
        mFragments.add(MineFragment.newInstance());

        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }

        commonTabLayout.setTabData(mTabEntities);

        commonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                viewPaper.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {
            }
        });

        //        预加载
        viewPaper.setOffscreenPageLimit(mFragments.size());
//        随着viewpaper的滑动，底部的菜单按钮也随之变动
        viewPaper.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                commonTabLayout.setCurrentTab(position);
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


        viewPaper.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),mTitles,mFragments));
    }


    }
