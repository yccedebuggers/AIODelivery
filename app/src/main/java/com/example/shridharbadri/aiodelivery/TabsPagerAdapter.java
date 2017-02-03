package com.example.shridharbadri.aiodelivery;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by HP on 03/02/2017.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter{
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // owner's activity
                return new SignUpActivityOwner();
            case 1:
                // Delivery Boy's activity
                return new SignUpActivityDeliveryBoy();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 4;//no of tabs
    }

}
