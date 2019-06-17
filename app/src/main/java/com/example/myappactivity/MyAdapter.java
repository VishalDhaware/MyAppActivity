package com.example.myappactivity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    public MyAdapter(Context context, FragmentManager fm, int totalTabs){
        super(fm);
        myContext=context;
        this.totalTabs=totalTabs;


    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Geate_activity geate = new Geate_activity();
                return geate;
            case 1:
                View_Activity view_activity  = new View_Activity();
                return view_activity;
            case 2:
                Emergency_Activity emergency =  new Emergency_Activity();
                return  emergency;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
