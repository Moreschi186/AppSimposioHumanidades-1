package com.devifsc.estagiario.appeventos.IHC;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devifsc.estagiario.appeventos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreAplicativoFragment extends Fragment {


    public SobreAplicativoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sobre_aplicativo, container, false);
    }

}
