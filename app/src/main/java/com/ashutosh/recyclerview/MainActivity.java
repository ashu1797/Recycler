package com.ashutosh.recyclerview;

import static com.ashutosh.recyclerview.R.id.recyclerContact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));

        arrContacts.add(new ContactModel(R.drawable.men1,"Ashutosh","8400097493"));
        arrContacts.add(new ContactModel(R.drawable.women1,"Naincy","9580192083"));
        arrContacts.add(new ContactModel(R.drawable.men2,"Pratyush","7897197273"));
        arrContacts.add(new ContactModel(R.drawable.women2,"Amisha","7252236598"));
        arrContacts.add(new ContactModel(R.drawable.men3,"Rahul","8559685236"));
        arrContacts.add(new ContactModel(R.drawable.women3,"Archana","8596547896"));
        arrContacts.add(new ContactModel(R.drawable.men4,"Sangam","9303014431"));
        arrContacts.add(new ContactModel(R.drawable.women4,"Shivangi","9893945654"));
        arrContacts.add(new ContactModel(R.drawable.men5,"Vivek","96701968656"));
        arrContacts.add(new ContactModel(R.drawable.women5,"Shivani","8456975852"));
        arrContacts.add(new ContactModel(R.drawable.men1,"Shivam","9305230221"));
        arrContacts.add(new ContactModel(R.drawable.women6,"Anupriya","8569753264"));
        arrContacts.add(new ContactModel(R.drawable.aa,"Sundaram","856984654"));
        arrContacts.add(new ContactModel(R.drawable.bb,"Anuj","01236878956"));
        arrContacts.add(new ContactModel(R.drawable.c,"Abhi","84585694512"));
        arrContacts.add(new ContactModel(R.drawable.d,"Satyam","985624651"));
        arrContacts.add(new ContactModel(R.drawable.ee,"Pari","96589225664"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

    }
}