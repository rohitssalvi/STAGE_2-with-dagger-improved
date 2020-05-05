package com.mindorks.bootcamp.learndagger.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.component.DaggerMainActrivityComponent;
import com.mindorks.bootcamp.learndagger.di.module.MainActivtyModule;
import com.mindorks.bootcamp.learndagger.fragment.HomeFragment;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
   @Inject
    public MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActrivityComponent
                .builder()
                .mainActivtyModule(new MainActivtyModule(this))
                .applicationComponent(((MyApplication)getApplication()).applicationComponent)
                .build()
                .inject(this);



         getSupportFragmentManager()
                 .beginTransaction()
                 .replace(R.id.Rl_Data,new HomeFragment())
                 .commit();

    }
}
