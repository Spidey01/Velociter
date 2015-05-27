/*
 * Copyright 2015 Terry Mathew Poulin <BigBoss1964@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spidey01.velociter.android;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.spidey01.velociter.android.BuildConfig;
import com.spidey01.velociter.android.R;


public class EditorActivity
    extends Activity
{
    private static final String TAG = "EditorActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate(): " + savedInstanceState);

        //TODO
        //PreferenceManager.setDefaultValues(this, R.xml.preferences, false);

        setContentView(R.layout.activity_editor);


        Log.i(TAG, "Intent#getData(): "+getIntent().getData());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause()");
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        /*
         * Handle landscape / portrait orientation change
         */
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.d(TAG, "onConfigurationChanged(): Configuration.ORIENTATION_LANDSCAPE");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Log.d(TAG, "onConfigurationChanged(): Configuration.ORIENTATION_PORTRAIT");
        }
    }


    @Override
    protected void onNewIntent(Intent intent) {
        Log.v(TAG, "onNewIntent()");

        // We don't handle this yet, so let's log it for posterity.
        Log.d(TAG, "onNewIntent(): intent.getData(): " + intent.getData());
        super.onNewIntent(intent);
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }


    @Override
    public void onTrimMemory(int level) {

        /*
         * We've gone into the LRU list.
         * Clean up resources that can efficiently and quickly be re-built on user return.
         */
        if (level >= TRIM_MEMORY_BACKGROUND) {
            Log.w(TAG, "onTrimMemory(TRIM_MEMORY_BACKGROUND)");
        }

        /*
         * We're nearing the end of the LRU list.
         * If more memory isn't found soon, we are dead.
         */
        if (level >= TRIM_MEMORY_COMPLETE) {
            Log.w(TAG, "onTrimMemory(TRIM_MEMORY_COMPLETE)");
            // Same level as onLowMemory().
            // I assume we can just do nothing and let the OS
            // call our onLowMemory().
        }

        /*
         * We're around the middle of the LRU list.
         * Freeing up memory will help the world.
         */
        if (level >= TRIM_MEMORY_MODERATE) {
            Log.w(TAG, "onTrimMemory(TRIM_MEMORY_MODERATE)");
        }

        /*
         * We're critical on memory.
         * Please for the love of users, free some memory!
         */
        if (level >= TRIM_MEMORY_RUNNING_CRITICAL) {
            Log.w(TAG, "onTrimMemory(TRIM_MEMORY_CRITICAL)");
        }

        /*
         * We're getting low on memory.
         * Be kind, be polite, trim some fat.
         */
        if (level >= TRIM_MEMORY_RUNNING_LOW) {
            Log.w(TAG, "onTrimMemory(TRIM_MEMORY_LOW)");
        }

        /*
         * We're moderate on memory.
         * Be kind, be polite, trim some fat.
         */
        if (level >= TRIM_MEMORY_RUNNING_MODERATE) {
            Log.w(TAG, "onTrimMemory(TRIM_MEMORY_MODERATE)");
        }

        /*
         * We're no longer showing UI.
         * Clean up UI stuff.
         */
        if (level >= TRIM_MEMORY_UI_HIDDEN) {
            Log.w(TAG, "onTrimMemory(TRIM_MEMORY_UI_HIDDEN)");
        }

        if (BuildConfig.DEBUG) {
            Toast.makeText(this, "Velociter onTrimMemory(): " + level, Toast.LENGTH_LONG).show();
        }

        super.onTrimMemory(level);
    }
}

