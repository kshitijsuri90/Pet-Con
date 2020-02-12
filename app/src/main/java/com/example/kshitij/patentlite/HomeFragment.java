package com.example.kshitij.patentlite;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Objects;


public class HomeFragment extends Fragment {

    private View rootview;
    private int score;
    private ImageView one;
    private ImageView two;
    private ImageView three;
    private ImageView four;
    private ImageView five;
    private ImageView six;
    private ImageView pet;
    private TextView mood;
    private Button sound;
    private MediaPlayer mediaPlayer;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_home, container, false);
        score = Objects.requireNonNull(getActivity()).getIntent().getExtras().getInt("score");
        pet = rootview.findViewById(R.id.pet);
        one = rootview.findViewById(R.id.heart1);
        two = rootview.findViewById(R.id.heart2);
        three = rootview.findViewById(R.id.heart3);
        four = rootview.findViewById(R.id.heart4);
        five = rootview.findViewById(R.id.heart5);
        six = rootview.findViewById(R.id.heart6);
        mood = rootview.findViewById(R.id.mood);
        sound = rootview.findViewById(R.id.playSound);
        mediaPlayer = MediaPlayer.create(getActivity(),R.raw.try1);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        switch (score) {
            case 0:
                one.setImageResource(R.drawable.ic_heart);
                two.setImageResource(R.drawable.ic_heart);
                three.setImageResource(R.drawable.ic_heart);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_cry);
                mood.setText("Gone");
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.gone);
                break;
            case 100:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart);
                three.setImageResource(R.drawable.ic_heart);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_cry);
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cry);
                mood.setText("Crying");
                break;
            case 200:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_sad);
                mood.setText("Sad");
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.sad);
                break;
            case 300:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_wtf);
                mood.setText("Agitated");
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.agitated);
                break;
            case 400:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart2);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_haha);
                mood.setText("Excited");
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.excited);
                break;
            case 500:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart2);
                five.setImageResource(R.drawable.ic_heart2);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_glasses);
                mood.setText("Awesome");
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.awesome);
                break;
            case 600:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart2);
                five.setImageResource(R.drawable.ic_heart2);
                six.setImageResource(R.drawable.ic_heart2);
                pet.setImageResource(R.drawable.dog_love);
                mood.setText("Happy");
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.happy);
                break;

        }
        return rootview;
    }

}
