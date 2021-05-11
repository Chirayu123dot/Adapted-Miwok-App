package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // creating an array of english numbers (words)
        //String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayList<Word> words = new ArrayList<>();
        // words.add("one")
        words.add(new Word("red","weṭeṭṭi"));
        words.add(new Word("green","chokokki"));
        words.add(new Word("brown","ṭakaakki"));
        words.add(new Word("gray","ṭopoppi"));
        words.add(new Word("black","kululli"));
        words.add(new Word("white","kelelli"));
        words.add(new Word("dusty yellow","ṭopiisә"));
        words.add(new Word("mustard yellow","chiwiiṭә"));


        //  ArrayList<String> words1 = new ArrayList<>(); // creating an ArrayList

        //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}