/*
 * Copyright (C) 2011 log-tools.net
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
package net.log_tools.slog.service;

import android.content.Intent;
import android.os.IBinder;
//port android.util.Log;

public class Service extends android.app.Service
{
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
//      Log.d("seqlog", "Service.onCreate()");
        super.onCreate();

        App app = (App)getApplication();
        app.start();
        app.running(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
//      Log.d("seqlog", "Service.onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
//      Log.d("seqlog", "Service.onDestroy()");
        super.onDestroy();

        App app = (App)getApplication();
        app.stop();
        app.running(false);
    }
}
