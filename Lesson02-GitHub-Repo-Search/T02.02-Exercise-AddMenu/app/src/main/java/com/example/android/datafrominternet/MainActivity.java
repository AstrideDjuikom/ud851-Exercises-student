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
package com.example.android.datafrominternet;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.datafrominternet.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    private EditText mSearchBoxEditText;

    private TextView mUrlDisplayTextView;

    private TextView mSearchResultsTextView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        context = this;

        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);

        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
    }

    // Do 2 - 7 in menu.xml ///////////////////////////////////////////////////////////////////////
    // T0DO (2) Create a menu xml called 'main.xml' in the res->menu folder
    // T0DO (3) Add one menu item to your menu
    // T0DO (4) Give the menu item an id of @+id/action_search
    // T0DO (5) Set the orderInCategory to 1
    // T0DO (6) Show this item if there is room (use app:showAsAction, not android:showAsAction)
    // T0DO (7) Set the title to the search string ("Search") from strings.xml
    // Do 2 - 7 in menu.xml ///////////////////////////////////////////////////////////////////////


    // T0DO (8) Override onCreateOptionsMenu
    // T0DO (9) Within onCreateOptionsMenu, use getMenuInflater().inflate to inflate the menu
    // T0DO (10) Return true to display your menu


    @Override
    protected boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemClickedId = item.getItemId();
        if (itemClickedId == R.id.action_search) {
            Toast.makeText(context, "Menu click", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // T0DO (11) Override onOptionsItemSelected
    // T0DO (12) Within onOptionsItemSelected, get the ID of the item that was selected
    // T0DO (13) If the item's ID is R.id.action_search, show a Toast and return true to tell Android that you've handled this menu click
    // T0DO (14) Don't forgot to call .show() on your Toast
    // T0DO (15) If you do NOT handle the menu click, return super.onOptionsItemSelected to let Android handle the menu click
}
