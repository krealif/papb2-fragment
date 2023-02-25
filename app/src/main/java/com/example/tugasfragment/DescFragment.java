package com.example.tugasfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class DescFragment extends Fragment {
    public DescFragment() {
        // Required empty public constructor
    }
    public static DescFragment newInstance() {
        return new DescFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_desc, container, false);
    }
}