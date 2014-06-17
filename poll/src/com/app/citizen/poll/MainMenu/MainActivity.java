package com.app.citizen.poll.MainMenu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import com.app.citizen.poll.MainMenu.slideout.SlideoutHelper;
import com.app.citizen.poll.R;


public class MainActivity extends FragmentActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSlideoutHelper = new SlideoutHelper(this);
        setContentView(R.layout.main);
        mSlideoutHelper.activate();
        getSupportFragmentManager().beginTransaction().add(R.id.slideout_placeholder, new ListFrag()).commit();
        mSlideoutHelper.open();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            mSlideoutHelper.close();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    public SlideoutHelper getSlideoutHelper() {
        return mSlideoutHelper;
    }

    private SlideoutHelper mSlideoutHelper;

}
