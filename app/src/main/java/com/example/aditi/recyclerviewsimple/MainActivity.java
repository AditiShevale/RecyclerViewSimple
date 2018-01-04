package com.example.aditi.recyclerviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aditi.recyclerviewsimple.adapter.MyRecyclerView;
import com.example.aditi.recyclerviewsimple.pojo.Details;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Button btn_add;
    private EditText edt;
    // recycler view refrence
    RecyclerView mRecyclerView;
    //creating array list to store the data
    ArrayList<Details> mDetails = new ArrayList<>();
    //refering to our recycler view adapter
    MyRecyclerView mMyRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add=findViewById(R.id.button);
        edt=findViewById(R.id.editText);

        mRecyclerView = findViewById(R.id.recyclerView);
        mMyRecyclerView = new MyRecyclerView(mDetails);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mMyRecyclerView);
       // addData();

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edt.getText().toString();
                Details details = new Details(name, "Pro");
                mDetails.add(details);
                mMyRecyclerView.notifyDataSetChanged();
                edt.setText("");


            }
        });


    }

    private void addData() {

        Details details = new Details("Aditi", "Pro");
        mDetails.add(details);
        details = new Details("Aditi", "Pro1");
        mDetails.add(details);
        details = new Details("Aditi", "Pro2");
        mDetails.add(details);
        details = new Details("Aditi", "Pro3");
        mDetails.add(details);
        details = new Details("Aditi", "Pro4");
        mDetails.add(details);
        mMyRecyclerView.notifyDataSetChanged();



    }

}
