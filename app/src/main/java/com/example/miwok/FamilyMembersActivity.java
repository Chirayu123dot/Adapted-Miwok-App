package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // creating an array of english numbers (words)
        //String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayList<Word> words = new ArrayList<>();
        // words.add("one")
        words.add(new Word("father", "әpә"));
        words.add(new Word("mother", "әṭa"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "teṭe"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother", "ama"));
        words.add(new Word("grandfather", "paapa"));

        //  ArrayList<String> words1 = new ArrayList<>(); // creating an ArrayList

        //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}