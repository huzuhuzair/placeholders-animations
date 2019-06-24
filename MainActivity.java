package com.ahangaraamir.place;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Placeholder mHolder;
private ConstraintLayout mLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHolder=findViewById(R.id.placeHolder);
        mLayout=findViewById(R.id.myLayout);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void swipe(View view) {
        TransitionManager.beginDelayedTransition(mLayout);
        mHolder.setContentId(view.getId());
    }
}
