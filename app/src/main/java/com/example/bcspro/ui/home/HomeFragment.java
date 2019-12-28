package com.example.bcspro.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bcspro.R;
import com.example.bcspro.SubjectActivity1;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {






    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //  return inflater.inflate(R.layout.fragment_page1, container, false);

        View rootView = inflater.inflate(R.layout.fragment_home,
                container, false);
        Button button = (Button) rootView.findViewById(R.id.subject1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
        return rootView;
    }

    public void updateDetail() {
        Intent intent = new Intent(getActivity(), SubjectActivity1.class);
        startActivity(intent);
    }
}