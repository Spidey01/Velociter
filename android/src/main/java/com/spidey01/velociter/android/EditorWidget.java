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

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;


public class EditorWidget
    extends EditText
{
    private static final String TAG = "EditorWidget";

    public EditorWidget(Context context) {
        super(context);
    }


    public EditorWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public EditorWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    /* Lollipop: 
    public EditorWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    */


}

