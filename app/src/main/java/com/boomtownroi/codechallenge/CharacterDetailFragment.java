package com.boomtownroi.codechallenge;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CharacterDetailFragment extends Fragment {

    public CharacterDetailFragment() {
        // Required empty public constructor
    }

    public static CharacterDetailFragment newInstance() {
        return new CharacterDetailFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_detail, container, false);
    }

}
