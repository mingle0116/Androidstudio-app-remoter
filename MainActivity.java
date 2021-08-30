package com.example.a726version;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private ShareActionProvider shareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Romoter");


        SectionsPagerAdapter pagerAdapter= new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager=(ViewPager) findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);

        TabLayout tablayout=(TabLayout) findViewById(R.id.tabs);
        tablayout.setupWithViewPager(pager);

}

    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }
        @Override
        public int getCount(){
            return 3;
        }
        @Override
        public Fragment getItem(int position){

            switch(position){
                case 0:
                    return new IntrodutionFragment();
                case 1:
                    return new TryFragment();
                case 2:
                    return new SearchFragment();
            }
            return null;
        }

        public CharSequence getPageTitle(int position){
            switch(position){
                case 0:
                    return getResources().getText(R.string.introdution_tab);
                case 1:
                    return getResources().getText(R.string.experience_tab);
                case 2:
                    return getResources().getText(R.string.search_tab);

            }
            return null;
        }


    }
}