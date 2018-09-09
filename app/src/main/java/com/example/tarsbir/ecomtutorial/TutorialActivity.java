package com.example.tarsbir.ecomtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TutorialActivity extends AppCompatActivity {
    public ListView listView;
    public MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        listView = findViewById(R.id.list_item);
        final ArrayList<TutorialCustom> arrayList = new ArrayList<>();
        arrayList.add(new TutorialCustom("1. A Program to illustrate text Font tag and pre tag."));
        arrayList.add(new TutorialCustom("2. A Program to illustrate text formatting tags."));
        arrayList.add(new TutorialCustom("3. A Program to illustrate Order List tag."));
        arrayList.add(new TutorialCustom("4. A Program to illustrate Unorder List tag."));
        arrayList.add(new TutorialCustom("5. A Program to illustrate Nested tag."));
        arrayList.add(new TutorialCustom("6. A Program to illustrate Imgage tag."));
        arrayList.add(new TutorialCustom("7. A Program to illustrate Hyper Link tag (Anchor tag)."));
        arrayList.add(new TutorialCustom("8. A Program to illustrate link to different parts on current webpage."));
        arrayList.add(new TutorialCustom("9. A Program to illustrate table with border,CellPadding,CellSpacing."));
        arrayList.add(new TutorialCustom("10. A Program to illustrate table as Cell Spans two columns."));
        arrayList.add(new TutorialCustom("11. A Program to illustrate table as Cell Spans two rows."));
        arrayList.add(new TutorialCustom("12. A Program to illustrate Frame tag."));
        arrayList.add(new TutorialCustom("13. A Program to illustrate Form tag."));
        arrayList.add(new TutorialCustom("14. A Program to illustrate span tag."));
        arrayList.add(new TutorialCustom("15. A Program to illustrate Embedded Multimedia."));
        arrayList.add(new TutorialCustom("16. A Program to illustrate CSS (cascading style sheet) internal."));
        arrayList.add(new TutorialCustom("17. A Program to illustrate CSS (cascading style sheet) external."));
        arrayList.add(new TutorialCustom("18. To create a Client Side Scripts for Validating Web Form Controls using DHTML."));
        arrayList.add(new TutorialCustom("19. JAVA SCRIPT TO PERFORM ALL ARITHMATIC OPERATION."));
        arrayList.add(new TutorialCustom("20. TO CHECK WHETHER A GIVEN NUMBER IS PRIME OR NOT."));
        arrayList.add(new TutorialCustom("21. TO SEARCH AN ELEMENT IN AN ARRAY OF SIZE “N”."));
        arrayList.add(new TutorialCustom("22. TO COMPUTE THE GCD OF 2 NUMBERS USING FUNCTION."));
        arrayList.add(new TutorialCustom("23. TO CHECK WHETHER THE GIVEN INTEGER IS PALINDROME OR NOT."));
        arrayList.add(new TutorialCustom("24. TO ILLUSTRATE DIFFERENT IN-BUILT STRING FUNCTIONS."));
        arrayList.add(new TutorialCustom("25. TO FIND THE SECOND LARGEST NUMBER IN AN ARRAY."));
        arrayList.add(new TutorialCustom("26. Setting up an ODBC Data Source."));
        arrayList.add(new TutorialCustom("27. Connect using ODBC Data Sources."));
        arrayList.add(new TutorialCustom("28. How to Create a SQL Server Database."));
        arrayList.add(new TutorialCustom("29. jQuery element Selector."));
        arrayList.add(new TutorialCustom("30. jQuery  #id Selector."));
        arrayList.add(new TutorialCustom("31. jQuery .class Selector."));
        arrayList.add(new TutorialCustom("32. jQuery Event Method : click()."));
        arrayList.add(new TutorialCustom("33. jQuery Effects - Hide and Show."));
        arrayList.add(new TutorialCustom("34. jQuery Effects - jQuery toggle()."));
        arrayList.add(new TutorialCustom("35. Using AJAX: change this text program."));
        arrayList.add(new TutorialCustom("36. An Example XML Document."));
        //arrayList.add(new TutorialCustom("37. Display XML Data in an HTML Page."));

        myAdapter=new MyAdapter(this,arrayList);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = parent.getPositionForView(view);
                if(pos==0){
                    Intent p1 = new Intent(getApplicationContext(),Program1.class);
                    startActivity(p1);
                    return;
                }
                if(pos==1){
                    Intent p2 = new Intent(getApplicationContext(),Program2.class);
                    startActivity(p2);
                    return;
                }
                if(pos==2){
                    Intent p3 = new Intent(getApplicationContext(),Program3.class);
                    startActivity(p3);
                    return;
                }
                if(pos==3){
                    Intent p4 = new Intent(getApplicationContext(),Program4.class);
                    startActivity(p4);
                    return;
                }
                if(pos==4){
                    Intent p5 = new Intent(getApplicationContext(),Program5.class);
                    startActivity(p5);
                    return;
                }
                if(pos==5){
                    Intent p6 = new Intent(getApplicationContext(),Program6.class);
                    startActivity(p6);
                    return;
                }
                if(pos==6){
                    Intent p7 = new Intent(getApplicationContext(),Program7.class);
                    startActivity(p7);
                    return;
                }
                if(pos==7){
                    Intent p8 = new Intent(getApplicationContext(),Program8.class);
                    startActivity(p8);
                    return;
                }
                if(pos==8){
                    Intent p9 = new Intent(getApplicationContext(),Program9.class);
                    startActivity(p9);
                    return;
                }
                if(pos==9){
                    Intent p10 = new Intent(getApplicationContext(),Program10.class);
                    startActivity(p10);
                    return;
                }
                if(pos==10){
                    Intent p11 = new Intent(getApplicationContext(),Program11.class);
                    startActivity(p11);
                    return;
                }
                if(pos==11){
                    Intent p12 = new Intent(getApplicationContext(),Program12.class);
                    startActivity(p12);
                    return;
                }
                if(pos==12){
                    Intent p13 = new Intent(getApplicationContext(),Program13.class);
                    startActivity(p13);
                    return;
                }
                if(pos==13){
                    Intent p14 = new Intent(getApplicationContext(),Program14.class);
                    startActivity(p14);
                    return;
                }
                if(pos==14){
                    Intent p15 = new Intent(getApplicationContext(),Program15.class);
                    startActivity(p15);
                    return;
                }
                if(pos==15){
                    Intent p16 = new Intent(getApplicationContext(),Program16.class);
                    startActivity(p16);
                    return;
                }
                if(pos==16){
                    Intent p17 = new Intent(getApplicationContext(),Program17.class);
                    startActivity(p17);
                    return;
                }
                if(pos==17){
                    Intent p18 = new Intent(getApplicationContext(),Program18.class);
                    startActivity(p18);
                    return;
                }
                if(pos==18){
                    Intent p19 = new Intent(getApplicationContext(),Program19.class);
                    startActivity(p19);
                    return;
                }
                if(pos==19){
                    Intent p20 = new Intent(getApplicationContext(),Program20.class);
                    startActivity(p20);
                    return;
                }
                if(pos==20){
                    Intent p21 = new Intent(getApplicationContext(),Program21.class);
                    startActivity(p21);
                    return;
                }
                if(pos==21){
                    Intent p22 = new Intent(getApplicationContext(),Program22.class);
                    startActivity(p22);
                    return;
                }if(pos==22){
                    Intent p23 = new Intent(getApplicationContext(),Program23.class);
                    startActivity(p23);
                    return;
                }if(pos==23){
                    Intent p24 = new Intent(getApplicationContext(),Program24.class);
                    startActivity(p24);
                    return;
                }if(pos==24){
                    Intent p25 = new Intent(getApplicationContext(),Program25.class);
                    startActivity(p25);
                    return;
                }if(pos==25){
                    Intent p26 = new Intent(getApplicationContext(),Program26.class);
                    startActivity(p26);
                    return;
                }if(pos==26){
                    Intent p27 = new Intent(getApplicationContext(),Program27.class);
                    startActivity(p27);
                    return;
                }if(pos==27){
                    Intent p28 = new Intent(getApplicationContext(),Program28.class);
                    startActivity(p28);
                    return;
                }if(pos==28){
                    Intent p29 = new Intent(getApplicationContext(),Program29.class);
                    startActivity(p29);
                    return;
                }if(pos==29){
                    Intent p30 = new Intent(getApplicationContext(),Program30.class);
                    startActivity(p30);
                    return;
                }if(pos==30){
                    Intent p31 = new Intent(getApplicationContext(),Program31.class);
                    startActivity(p31);
                    return;
                }
                if(pos==31){
                    Intent p32 = new Intent(getApplicationContext(),Program32.class);
                    startActivity(p32);
                    return;
                }if(pos==32){
                    Intent p33 = new Intent(getApplicationContext(),Program33.class);
                    startActivity(p33);
                    return;
                }if(pos==33){
                    Intent p34 = new Intent(getApplicationContext(),Program34.class);
                    startActivity(p34);
                    return;
                }if(pos==34){
                    Intent p35 = new Intent(getApplicationContext(),Program35.class);
                    startActivity(p35);
                    return;
                }if(pos==35){
                    Intent p36 = new Intent(getApplicationContext(),Program36.class);
                    startActivity(p36);
                } else
                    Toast.makeText(getApplicationContext(),"Try Again",Toast.LENGTH_LONG).show();

            }
        });
    }
}
