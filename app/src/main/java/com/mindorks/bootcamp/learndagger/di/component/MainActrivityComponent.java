package com.mindorks.bootcamp.learndagger.di.component;

import android.app.Activity;

import com.mindorks.bootcamp.learndagger.di.ActivityScope;
import com.mindorks.bootcamp.learndagger.di.module.MainActivtyModule;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;

import dagger.Component;
import dagger.Module;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class},modules = {MainActivtyModule.class})
public interface MainActrivityComponent {

    void inject(MainActivity activity);
}
