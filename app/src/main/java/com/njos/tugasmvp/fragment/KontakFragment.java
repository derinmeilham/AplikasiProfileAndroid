package com.njos.tugasmvp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.njos.tugasmvp.R;
//tanggal 18/05/2019
//NIM : 10116040
//NAMA : Anjas Kurnia Sandy
//Kelas : IF 1

public class KontakFragment extends Fragment {

    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false);
    }


}
