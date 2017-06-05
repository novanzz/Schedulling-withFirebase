package com.example.asus.scheduling.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.asus.scheduling.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SgnNotRegst extends AppCompatActivity implements View.OnClickListener{
    private Button Out;
    private Button mkGroup;
    private Button jnGroup;
// buat realtime db
    private DatabaseReference mFirebaseDatabase,userRef;
    private FirebaseDatabase mFirebaseInstance;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgn_not_regst);

        Out = (Button) findViewById(R.id.Out);
        mkGroup = (Button) findViewById(R.id.mkGroup);
        jnGroup = (Button) findViewById(R.id.jnGroup);
        Out.setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();
        mkGroup.setOnClickListener(this);
        jnGroup.setOnClickListener(this);

        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase = mFirebaseInstance.getReference();
        userRef = mFirebaseDatabase;



    }
    private void out(){

        finish();
    }
    private void MkGroup(){
        startActivity(new Intent(SgnNotRegst.this,MakeGroup.class));
    }

    private void JnGroup(){

                startActivity(new Intent(SgnNotRegst.this,JoinGrupActivity.class));
    }


    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.Out:
                    out();
                    break;
                case  R.id.mkGroup:
                    MkGroup();
                    break;
                case R.id.jnGroup:
                    JnGroup();
                    break;

            }
    }
}
