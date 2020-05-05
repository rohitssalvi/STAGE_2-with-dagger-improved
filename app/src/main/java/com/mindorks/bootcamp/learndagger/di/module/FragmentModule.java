package com.mindorks.bootcamp.learndagger.di.module;

import android.app.Activity;
import android.content.Context;

import androidx.fragment.app.Fragment;

import com.mindorks.bootcamp.learndagger.di.ActivityScope;
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }
    @ActivityContext
   @Provides
   Context ProvideContext()
   {
       return fragment.getContext();
   }


}
