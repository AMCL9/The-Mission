package com.example.firstchurchofgodapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.firstchurchofgodapplication.controller.FragmentListener;


public class EntranceFragment extends Fragment {
    FragmentListener fragmentListener;
    private TextView textView;
    private Button button;
    private final String SMS_BODY = "sms_body";


    public static Bundle args = new Bundle();


    private static final String SCRIPTURE = "param1";
    private static final String BOOKTEXT = "param2";
    private static final String CHAPTERTEXT = "param3";
    private static final String VERSETEXT = "param4";
    private static final String SCRIPTURETEXT = "param5";



    private static String getScripture;
    private static String getChaptertext;
    private static String getBooktext;
    private static String getVersetext;
    private static String getScripturetext;




    public EntranceFragment() {

    }

    public static EntranceFragment newInstance(String scriptureText, String bookText, String chapterText, String verseText, String scripture) {
        EntranceFragment fragment = new EntranceFragment();

        args.putString(SCRIPTURE, scripture);
        args.putString(BOOKTEXT, bookText);
        args.putString(CHAPTERTEXT,chapterText);
        args.putString(VERSETEXT, verseText);
        args.putString(SCRIPTURETEXT, scriptureText);
        Log.d("PILINCHONG", "newInstance: " + args.getString(SCRIPTURE));
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

            getScripture = getArguments().getString(SCRIPTURE);
            getChaptertext = getArguments().getString(CHAPTERTEXT);
            getBooktext = getArguments().getString(BOOKTEXT);
            getVersetext = getArguments().getString(VERSETEXT);
            getScripturetext = getArguments().getString(SCRIPTURETEXT);

        }
    }


    public static void checking(View view) {
        if (getScripture == null) {
            String toast = "hell naw to the naw naw naw";
            Toast.makeText(view.getContext(),toast,Toast.LENGTH_LONG).show();
        }
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_entrance, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        textView = view.findViewById(R.id.uniqueScripture);
        textView.setText(getScripturetext);
        checking(view);


        button = view.findViewById(R.id.enter_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickSaysGo();
            }


        });
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

    public void buttonClickSaysGo (){
        Intent sharingIntent = new Intent(Intent.ACTION_VIEW);
        sharingIntent.setData(Uri.parse("sms:"));
        sharingIntent.putExtra(SMS_BODY, getScripturetext);
        startActivity(sharingIntent);


    }



}
