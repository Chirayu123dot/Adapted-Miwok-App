package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // creating an array of english numbers (words)
        //String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayList<Word> words = new ArrayList<>();
        // words.add("one")
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        //  ArrayList<String> words1 = new ArrayList<>(); // creating an ArrayList

        //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}