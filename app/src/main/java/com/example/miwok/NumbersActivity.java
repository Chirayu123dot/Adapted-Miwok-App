package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // creating an array of english numbers (words)
        //String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayList<Word> words = new ArrayList<>();
       // words.add("one")
        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

      //  ArrayList<String> words1 = new ArrayList<>(); // creating an ArrayList
       
      //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
