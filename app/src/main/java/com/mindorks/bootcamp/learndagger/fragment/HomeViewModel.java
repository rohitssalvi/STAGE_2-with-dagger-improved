package com.mindorks.bootcamp.learndagger.fragment;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

public class HomeViewModel {
    private DatabaseService databaseService;
    private NetworkService networkService;
    private NetworkHelper networkHelper;

    @Inject
    public HomeViewModel(DatabaseService databaseService, NetworkService networkService, NetworkHelper networkHelper) {
        this.databaseService = databaseService;
        this.networkService = networkService;
        this.networkHelper = networkHelper;
    }


    public boolean isNetworkConnected()
    {
        return networkHelper.isNetworkConnected();
    }

    public String getDummyData()
    {
        return databaseService.getDummyData()+","+networkService.getDummyData();
    }
}
