package me.developermuda.www.tabviewbiginner;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragment = new ArrayList<>();
    private final List<String> mtitleList = new ArrayList<>();
    public void addFragment(Fragment fragment, String title){
        mfragment.add(fragment);
        mtitleList.add(title);
    }


    public SectionAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mtitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragment.get(position);
    }

    @Override
    public int getCount() {
        return mfragment.size();
    }
}
