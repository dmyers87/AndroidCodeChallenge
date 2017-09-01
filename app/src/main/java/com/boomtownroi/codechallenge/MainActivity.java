package com.boomtownroi.codechallenge;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(R.id.leftFragmentContainer, CharacterListFragment.newInstance());
        loadFragment(R.id.rightFragmentContainer, CharacterDetailFragment.newInstance());
    }

    /**
     * Loads a fragment into a specific Fragment Container.
     *
     * @param nextFragment The fragment you want to load.
     */
    private void loadFragment(@IdRes int fragmentContainer, Fragment nextFragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Fragment current = manager.findFragmentById(fragmentContainer);
        if (current == null) {
            transaction.add(fragmentContainer, nextFragment);
        } else {
            transaction.replace(fragmentContainer, nextFragment);
            transaction.addToBackStack(null);
        }
        if (!this.isDestroyed()) {
            transaction.commit();
        }
    }
}
