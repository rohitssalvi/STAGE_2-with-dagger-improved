package com.mindorks.bootcamp.learndagger.di.module;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext;
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo;
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }
    @ApplicationContext
    @Provides
    Context ProvideContext()
    {
        return application;
    }
    @DatabaseInfo
    @Provides
    String ProvideDatabaseName()
    {
        return "dummy_db";
    }
    @NetworkInfo
    @Provides
    String ProvideApiKey()
    {
        return "abc";
    }
    @Provides
    int ProvideDatabaseVersion()
    {
        return 1;
    }

   /* @Singleton
    @Provides
    NetworkService ProvideNetworkService()
    {
        return new NetworkService(application,"abcdef");
    }
    @Singleton
    @Provides
    DatabaseService ProvideDatabaseService()
    {
        return new DatabaseService(application,"dummy_db",1);
    }*/
}
