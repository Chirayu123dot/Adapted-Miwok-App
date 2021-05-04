/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.miwok;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers), familyMembers = findViewById(R.id.family), colors = findViewById(R.id.colors), phrases = findViewById(R.id.phrases);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Numbers Tab Opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);
            }
        });
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Family Members Tab Opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(intent);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Colors Tab Opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intent);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Phrases Tab Opened", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }
//    /**
//     * this method sends an intent to open the NumbersActivity. Method is called when the Numbers TextView is clicked
//     */
//    public void openNumbersList(View view){
//        // send an intent
//        // creating an Intent object
//        Intent intent = new Intent(this, NumbersActivity.class);
//            startActivity(intent);
//    }
//    public void openFamilyMembersList(View view){
//        //creating an Intent object
//        Intent intent = new Intent(this, FamilyMembersActivity.class);
//            startActivity(intent);
//    }
//    public void openColorsList(View view){
//        //creating an Intent object
//        Intent intent = new Intent(this, ColorsActivity.class);
//            startActivity(intent);
//    }
//    public void openPhrasesList(View view){
//        //creating an Intent object
//        Intent intent = new Intent(this, PhrasesActivity.class);
//            startActivity(intent);
//    }
}
