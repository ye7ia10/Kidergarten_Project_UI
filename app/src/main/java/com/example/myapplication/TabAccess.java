package com.example.myapplication;

import com.example.myapplication.ui.main.KeepUp;
import com.example.myapplication.ui.main.NewsFrag;
import com.example.myapplication.ui.main.Resources;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccess extends FragmentPagerAdapter {

    public TabAccess(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                NewsFrag newsFrag = new NewsFrag();
                return newsFrag;
            case 1:
                Resources groupsFrag = new Resources();
                return groupsFrag;
            case 2:
                KeepUp contactsFrag = new KeepUp();
                return contactsFrag;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return "News";
            case 1:
                return "Resources";
            case 2:
                return "Keep Up";
            default:
                return null;
        }
    }
}
