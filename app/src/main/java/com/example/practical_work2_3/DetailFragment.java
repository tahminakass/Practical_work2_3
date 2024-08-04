package com.example.practical_work2_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DetailFragment extends Fragment {

    Button buttonClick;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonClick = requireActivity().findViewById(R.id.btn_click);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "From detail";
                Bundle bundle = new Bundle();
                bundle.putString("message", text);
                SecondFragment fragment = new SecondFragment();
                fragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.fragment_container_view, fragment).
                        addToBackStack(null).commit();

            }
        });
    }
}