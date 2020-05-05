package com.mindorks.bootcamp.learndagger.di.module;

import android.app.Activity;
import android.content.Context;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;
import com.mindorks.bootcamp.learndagger.ui.MainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivtyModule
{
    private Activity activity;

    public MainActivtyModule(Activity activity) {
        this.activity = activity;
    }
     @ActivityContext
     @Provides
    Context ProvideContext()
    {
        return activity;
    }

   /* @Provides
    MainViewModel ProvideMainViewModel(DatabaseService databaseService,NetworkService networkService)
    {
        return new MainViewModel(databaseService,networkService);
    }*/
}
