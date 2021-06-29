package com.example.alipay.util;

import com.example.alipay.R;
import com.example.alipay.entity.GridItemEntity;
import com.example.alipay.entity.SmallAppEntity;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<GridItemEntity> getGridItem(){
        List<GridItemEntity> gridItemEntities = new ArrayList<>();
        gridItemEntities.add(new GridItemEntity(R.mipmap.eleme,"饿了么"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.koubei,"口碑"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.shimingzhongxin,"市民中心"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.taopiaopiao,"淘票票"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.chongzhi,"充值中心"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.yuebao,"余额宝"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.huabei,"花呗"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.mayizhuangyuan,"蚂蚁庄园"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.huochepiao,"火车票机票"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.mayisenlin,"蚂蚁森林"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.didichuxing,"滴滴出行"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.jiankangma,"健康码"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.jijin,"基金"));
        gridItemEntities.add(new GridItemEntity(R.mipmap.gengduo,"更多"));
        return gridItemEntities;
    }

    public static List<GridItemEntity> getGridTop(){
        List<GridItemEntity> listtop = new ArrayList<>();
        listtop.add(new GridItemEntity(R.mipmap.saoyisao,"扫一扫"));
        listtop.add(new GridItemEntity(R.mipmap.fuqian,"付钱/收钱"));
        listtop.add(new GridItemEntity(R.mipmap.chuxing,"出行"));
        listtop.add(new GridItemEntity(R.mipmap.kabao,"卡包"));
        return  listtop;
    }

    public static List<SmallAppEntity> getSmallApp(){
        List<SmallAppEntity> listapp = new ArrayList<>();
        listapp.add(new SmallAppEntity("img0","name","describemsg",
                "img1","text1","img2","text2","img3","text3",1));
        listapp.add(new SmallAppEntity("img0","name","describemsg",
                "img1","text1","img2","text2","img3","text3",2));
        listapp.add(new SmallAppEntity("img0","name","describemsg",
                "img1","text1","img2","text2","img3","text3",1));
        listapp.add(new SmallAppEntity("img0","name","describemsg",
                "img1","text1","img2","text2","img3","text3",2));
        listapp.add(new SmallAppEntity("img0","name","describemsg",
                "img1","text1","img2","text2","img3","text3",1));
        listapp.add(new SmallAppEntity("img0","name","describemsg",
                "img1","text1","img2","text2","img3","text3",2));
        return listapp;
    }

}
