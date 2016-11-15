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
package com.example.android.miwok;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class  NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //creating an arraY Called words

        ArrayList<Word> words = new ArrayList<Word>();

      //words.add("one);
        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massoka"));
        words.add(new Word("six","temmoka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawita"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

        //creating an array adapter whose data source is a list of strings from words
        //adapter creates the layouts for each words from the array List
        //dispaly the single words
        WordAdapter adapter= new WordAdapter(this,words);


        //finding the listView with the ID from the XML
        GridView listView = (GridView) findViewById(R.id.rootView);

        //ListView will now make use of the ArrayAdapter that we created to display list items for eachword in the list of words.
        listView.setAdapter(adapter);

        }


    }

