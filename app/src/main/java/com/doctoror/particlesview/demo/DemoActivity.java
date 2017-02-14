/*
 * Copyright (C) 2017 Yaroslav Mytkalyk
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
package com.doctoror.particlesview.demo;

import com.doctoror.particlesview.ParticlesDrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public final class DemoActivity extends AppCompatActivity {

    private final ParticlesDrawable mDrawable = new ParticlesDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_demo);
        findViewById(android.R.id.content).setBackgroundDrawable(mDrawable);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mDrawable.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mDrawable.stop();
    }
}
