package com.boomtownroi.codechallenge;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CharacterListFragment extends Fragment {


    public CharacterListFragment() {
        // Required empty public constructor
    }

    public static CharacterListFragment newInstance() {
        return new CharacterListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_list, container, false);
    }

}
