package com.example.firstchurchofgodapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.firstchurchofgodapplication.controller.FragmentListener;
import com.example.firstchurchofgodapplication.network.RetrofitSingleton;

import retrofit2.Retrofit;


public class EntranceFragment extends Fragment {
    private FragmentListener fragmentListener;
    private TextView textView;
    private Button button;

    private static final String BOOK = "param3";
    private static final String CHAPTER = "param1";
    private static final String SCRIPTURE = "param2";

    private String getChoice;
    private String getScripture;
    private String getBook;



    public EntranceFragment() {

    }

    public static EntranceFragment newInstance(String book, String chapter, String scripture) {
        EntranceFragment fragment = new EntranceFragment();
        Bundle args = new Bundle();
        args.putString(BOOK, book);
        args.putString(CHAPTER, chapter);
        args.putString(SCRIPTURE, scripture);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            getChoice = getArguments().getString(CHAPTER);
            getScripture = getArguments().getString(SCRIPTURE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_entrance, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentListener) {
            fragmentListener = (FragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        fragmentListener = null;
    }



}
