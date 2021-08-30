package com.example.a726version;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class IntrodutionFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView introRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_introdution, container, false);
        String[] introNames = new String[Introdata.introdata.length];
        for (int i = 0; i < introNames.length; i++) {
            introNames[i] = Introdata.introdata[i].getName();
        }
        int[] introImages = new int[Introdata.introdata.length];
        for (int i = 0; i < introImages.length; i++) {
            introImages[i] = Introdata.introdata[i].getImageResourceId();
        }

        CaptionedImageAdapter adapter=new CaptionedImageAdapter(introNames,introImages);
        introRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        introRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new CaptionedImageAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent=new Intent(getActivity(),IntroDetailActivity.class);
                intent.putExtra(IntroDetailActivity.ExTRA_intro_ID,position);
                getActivity().startActivity(intent);
            }
        });
        return introRecycler;
    }
}