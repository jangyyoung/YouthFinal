package com.example.youthfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner1,spinner2;
    ActionBar abar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button searchButton=(Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result_intent = new Intent(getApplicationContext(),SearchResult.class);
                startActivity(result_intent);
            }
        });

        abar=getSupportActionBar();
        abar.setDisplayHomeAsUpEnabled(true);
        abar.setLogo(R.drawable.gglogo);
        abar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME|ActionBar.DISPLAY_USE_LOGO);


        spinner1=(Spinner)findViewById(R.id.spinner1);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter adapter1=ArrayAdapter.createFromResource(this,R.array.정책유형,android.R.layout.simple_spinner_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
         int curId = item.getItemId();
        switch (curId) {
            case R.id.menu_search:{
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.information:{
                Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.mypage:{
                Intent intent = new Intent(getApplicationContext(), ChangeSettingActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.setting:{
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
                break;
            }
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(spinner1.getSelectedItem().equals("취업역량강화")){
            Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
            ArrayAdapter adapter2=ArrayAdapter.createFromResource(this,R.array.세부유형_취업역량강화,android.R.layout.simple_spinner_item);
            spinner2.setAdapter(adapter2);
        }else if(spinner1.getSelectedItem().equals("창업지원")){
            ArrayAdapter adapter2=ArrayAdapter.createFromResource(this,R.array.세부유형_창업지원, android.R.layout.simple_spinner_item);
            spinner2.setAdapter(adapter2);
        }else if(spinner1.getSelectedItem().equals("생활안정")){
            ArrayAdapter adapter2=ArrayAdapter.createFromResource(this,R.array.세부유형_생활안정, android.R.layout.simple_spinner_item);
            spinner2.setAdapter(adapter2);
        }
        else if(spinner1.getSelectedItem().equals("주거,복지,금융")){
            ArrayAdapter adapter2=ArrayAdapter.createFromResource(this,R.array.세부유형_주거_복지_금융, android.R.layout.simple_spinner_item);
            spinner2.setAdapter(adapter2);
        }
    }

    public void onNothingSelected(AdapterView<?> parent){

    }




}