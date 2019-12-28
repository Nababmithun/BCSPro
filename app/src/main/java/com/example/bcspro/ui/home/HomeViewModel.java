package com.example.bcspro.ui.home;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bcspro.R;
import com.example.bcspro.SubjectActivity1;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
       // mText.setValue("This is home fragment");
    }


    public LiveData<String> getText() {
        return mText;
    }
}