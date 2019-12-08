package com.sabin.gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerView);

        List<mail> mailList = new ArrayList<>();

        mailList.add(new mail("Parrot","Origins and evolution","Psittaciform diversity in South America and Australasia","11/01/2019",R.drawable.p));
        mailList.add(new mail("Nightingale","About this animal ","It is a migratory insectivorous species breeding in forest and scrub in Europe and south-west Asia,","10/18/2019",R.drawable.n));
        mailList.add(new mail("Monkey","About this animal","As apes have emerged in the monkey group as sister of the old world monkeys, characteristics","09/03/2019",R.drawable.m));
        mailList.add(new mail("Turkey","About this bird","The turkey is a large bird that is closely related to other game birds such as pheasants, chickens and quails","12/01/2019",R.drawable.t));
        mailList.add(new mail("Ant","Ant Facts for Kids","There are more than 12,000 species of ants all over the world","07/07/2019",R.drawable.a));
        mailList.add(new mail("Salamander","Is a newt a salamander?","Yes, but a salamander is not always a newt. Confused?","10/7/2019",R.drawable.s));
        mailList.add(new mail("Deer","About this animal","The deer is found in the forests of Europe, Asia and North America","11/21/2019",R.drawable.dd));
        mailList.add(new mail("Leopard","Characteristics","The leopard's skin colour varies between individuals from pale yellowish to dark golden with dark spots grouped in rosettes.","08/03/2019",R.drawable.l));



mailAdapter mailAdapter = new mailAdapter(this, mailList);
recyclerview.setAdapter(mailAdapter);
recyclerview.setLayoutManager(new LinearLayoutManager(this));




    }
}
