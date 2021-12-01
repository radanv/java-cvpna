package com.example.cvpna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class OptionFragment extends Fragment {
    public OptionFragment() {
    }

    public static VPNFragment newInstance() {
        return new VPNFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_option, container, false);
    }
}
