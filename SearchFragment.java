package com.example.a726version;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;




public class SearchFragment extends ListFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter= new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.docs));
             setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
       switch(position) {
           case 1: {
               Intent intent0 = new Intent(getActivity(), Baby_search.class);
               startActivity(intent0);
               break;
           }
           case 0: {
               Intent intent1 = new Intent(getActivity(), Box_search.class);
               startActivity(intent1);
               break;
           }
           case 2: {
               Intent intent2 = new Intent(getActivity(), Check_search.class);
               startActivity(intent2);
               break;
           }

           default: {
               throw new IllegalStateException("Unexpected value: " + position);

           }

       }
    }
}