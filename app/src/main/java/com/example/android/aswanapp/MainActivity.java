package com.example.android.aswanapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] tabTitle=new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new SimpleFragmentPagerAdapter(getSupportFragmentManager(),MainActivity.this,setTabTitle()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        }
        private String[] setTabTitle (){
            for(int i=0; i<=3;i++)
            {
                if (i==0)
                {
                    tabTitle[i]=getString(R.string.tab_Title_1);
                }else if(i==1){
                    tabTitle[i]=getString(R.string.tab_Title_2);
                }else  if(i==2){
                    tabTitle[i]=getString(R.string.tab_Title_3);
                }else{
                    tabTitle[i]=getString(R.string.tab_Title_4);
                }

            }
           return  tabTitle;
        }
}
