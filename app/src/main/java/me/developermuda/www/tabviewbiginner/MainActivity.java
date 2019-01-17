package me.developermuda.www.tabviewbiginner;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private static final String Tag = "MainActivity";
private SectionAdapter msectionAdapter;
private ViewPager mviewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate","String");

        msectionAdapter =new SectionAdapter(getSupportFragmentManager());
        mviewpager = (ViewPager)findViewById(R.id.container);
        setpager(mviewpager);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mviewpager);


    }
    private void setpager (ViewPager viewPager){

        SectionAdapter adapter = new SectionAdapter(getSupportFragmentManager());
        adapter.addFragment(new TblFragment1(),"Table1");
        adapter.addFragment(new TabFragment2(),"Table2");

    viewPager.setAdapter(adapter);
    }

}
