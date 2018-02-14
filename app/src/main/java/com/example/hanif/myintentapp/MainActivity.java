package com.example.hanif.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveAcitivity;
    private Button btnMoveWithDataAcitivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveAcitivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveAcitivity.setOnClickListener(this);
        btnMoveWithDataAcitivity = (Button)findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataAcitivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this,MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this,MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Hanif Razin Rahmatullah");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,22);
                startActivity(moveWithDataIntent);
                break;
        }
    }
}
