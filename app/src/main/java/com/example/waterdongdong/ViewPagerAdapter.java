package com.example.waterdongdong;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //프래그먼트 교체를 보여주는 처리를 구현한 곳
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FragDay.newInstance();
            case 1:
                return FragWeek.newInstance();
            case 2:
                return FragMonth.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    //상단의 탭 레이아웃 텍스트 선언 해주는 곳
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "일";
            case 1:
                return "주";
            case 2:
                return "월";
            default:
                return null;
        }
    }
}
