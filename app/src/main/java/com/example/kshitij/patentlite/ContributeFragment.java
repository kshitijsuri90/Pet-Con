package com.example.kshitij.patentlite;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContributeFragment extends Fragment {

    private int score;
    private int footprint;

    public ContributeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_contribute, container, false);
        RelativeLayout layout1 = rootView.findViewById(R.id.oneLife);
        RelativeLayout layout2 = rootView.findViewById(R.id.twoLife);
        RelativeLayout layout3 = rootView.findViewById(R.id.threeLife);
        score = getActivity().getIntent().getExtras().getInt("score");
        footprint = getActivity().getIntent().getExtras().getInt("footprint");
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleAlert(rootView, getContext(), "1 health");
                score+=100;
                score = Math.min(600,Math.max(0,score));
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleAlert(rootView, getContext(), "2 health");
                score+=200;
                score = Math.min(600,Math.max(0,score));
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleAlert(rootView, getContext(), "3 health");
                score+=300;
                score = Math.min(600,Math.max(0,score));
            }
        });
        return rootView;
    }

    public void simpleAlert(View view, final Context context, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Congratulations!!");
        builder.setMessage("You have just bought " + msg + " and a real tree will be planted at the India TIST reforestation project!");
        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity().getApplicationContext(),"Health restored",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getActivity().getApplicationContext(),NavigationActivity.class);
                        intent.putExtra("score",score);
                        intent.putExtra("footprint",footprint);
                        getActivity().startActivity(intent);
                    }
                });
        builder.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(context,
                        android.R.string.no, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setCancelable(false);
        builder.show();
    }

}
