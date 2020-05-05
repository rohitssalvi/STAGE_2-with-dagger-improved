package com.mindorks.bootcamp.learndagger.di.component;

import android.app.Activity;

import androidx.fragment.app.Fragment;

import com.mindorks.bootcamp.learndagger.di.FragmentScope;
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule;
import com.mindorks.bootcamp.learndagger.fragment.HomeFragment;

import dagger.Component;
@FragmentScope
@Component(dependencies = {ApplicationComponent.class},modules = {FragmentModule.class})
public interface FragmentComponent {

    void inject(HomeFragment fragment);

}
