package com.example.shridharbadri.aiodelivery;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabPagerActivity extends FragmentActivity implements ActionBar.TabListener{


    private ViewPager viewPager;// used for swiping
    private TabsPagerAdapter mAdapter;// adapter is used for swiping
    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = {"Owners", "Delivery Boy's"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_pager);

        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();// returns functionality of action bar
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);// calls adapter
        actionBar.setHomeButtonEnabled(false);// needs 14 min sdk version in
        // manifest.xml
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Adding Tabs
        // action bar's tab **
        for (String tab_name : tabs)
            actionBar.addTab(actionBar.newTab().setText(tab_name).setTabListener(this));// this is for clicking purpose on

        /**
         * on swiping the viewpager make respective tab selected because of
         * following listener
         * */
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                // on changing the page
                // make respected tab selected
                actionBar.setSelectedNavigationItem(position);// position of
                // tabs
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

    // following are used for action bar click event came from **

  //  @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

//    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // on tab selected
        // show respected fragment view.tab pe fragment change krna
        viewPager.setCurrentItem(tab.getPosition());
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

}


