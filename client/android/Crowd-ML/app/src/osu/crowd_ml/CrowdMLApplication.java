package osu.crowd_ml;

import android.app.Application;

import com.firebase.client.Firebase;

/*
Copyright 2017 Crowd-ML team


Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License
*/

public class CrowdMLApplication extends Application {

    private static CrowdMLApplication instance;
    public static CrowdMLApplication getAppContext() { return instance; }

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        instance = this;
    }
}
