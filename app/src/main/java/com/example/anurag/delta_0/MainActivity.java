package com.example.anurag.delta_0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int r = 0, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, i = 0,k=0,l=0,m=0,n=0,o=0,p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = findViewById(R.id.image);
        image.setBackground(getResources().getDrawable(R.drawable.luck));
        Button button3 =findViewById(R.id.button3);
        button3.setVisibility(View.INVISIBLE);

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);

       /** a = sharedPreferences.getInt("POWER_STONE", 0);
        b = sharedPreferences.getInt("SPACE_STONE", 0);
        c = sharedPreferences.getInt("TIME_STONE", 0);
        d = sharedPreferences.getInt("REALITY_STONE", 0);
        e = sharedPreferences.getInt("SOUL_STONE", 0);
        f = sharedPreferences.getInt("MIND_STONE", 0);
        */

        String power = sharedPreferences.getString("POWER_STONE_TEXT", "");
        String space = sharedPreferences.getString("SPACE_STONE_TEXT", "");
        String time = sharedPreferences.getString("TIME_STONE_TEXT", "");
        String reality = sharedPreferences.getString("REALITY_STONE_TEXT", "");
        String soul = sharedPreferences.getString("SOUL_STONE_TEXT", "");
        String mind = sharedPreferences.getString("MIND_STONE_TEXT", "");



        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        TextView text5 = findViewById(R.id.text5);
        TextView text6 = findViewById(R.id.text6);
        TextView text7 = findViewById(R.id.text7);
        text2.setText(power);
        text3.setText(space);
        text4.setText(time);
        text5.setText(reality);
        text6.setText(soul);
        text7.setText(mind);

        //Log.d("HERE", "" + a + " " + b + " " + c + " " + d + " " + f);

       /** if(a == 1){
            Log.d("HERE", "HERE");
            text2.setText("YOU  HAVE  RECEIVED  THE  POWER  STONE - purple");
        }
        if(b==2){
            Log.d("HERE", "HERE2");

            text3.setText("YOU  HAVE  RECEIVED  THE  SPACE  STONE - blue");
        }
        if(c==3){
            Log.d("HERE", "HERE3");

            text4.setText("YOU  HAVE  RECEIVED  THE  TIME  STONE - green");
        }
        if(d==4){
            Log.d("HERE", "HERE4");

            text5.setText("YOU  HAVE  RECEIVED  THE  REALITY  STONE - red");
        }
        if(e==5){
            Log.d("HERE", "HERE5");

            text6.setText("YOU  HAVE  RECEIVED  THE  SOUL  STONE - orange");
        }
        if(f==6){
            Log.d("HERE", "HERE6");

            text7.setText("YOU  HAVE  RECEIVED  THE  MIND  STONE - yellow");
        }
*/

        Log.d("LIFECYCLE", "ON CREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "ON START");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "ON RESUME");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "ON PAUSE");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "ON STOP");


    }

    @Override
    protected void onDestroy() {
        Log.d("LIFECYCLE", "ON DESTROY");

        super.onDestroy();

    }

    private void saveData(){

        SharedPreferences sharedPreferences = getPreferences(Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        /**editor.putInt("POWER_STONE", a);
        editor.putInt("SPACE_STONE", b);
        editor.putInt("TIME_STONE", c);
        editor.putInt("REALITY_STONE", d);
        editor.putInt("SOUL_STONE", e);
        editor.putInt("MIND_STONE", f);*/

       // Log.d("HERE", " " + a + " " + b + " " + c + " " + d + " " + f);

        TextView text2 = findViewById(R.id.text2);
         editor.putString("POWER_STONE_TEXT", text2.getText().toString());
         TextView text3 = findViewById(R.id.text3);
         editor.putString("SPACE_STONE_TEXT", text3.getText().toString());
         TextView text4 = findViewById(R.id.text4);
         editor.putString("TIME_STONE_TEXT", text4.getText().toString());
         TextView text5 = findViewById(R.id.text5);
         editor.putString("REALITY_STONE_TEXT", text5.getText().toString());
         TextView text6 = findViewById(R.id.text6);
         editor.putString("SOUL_STONE_TEXT", text6.getText().toString());
         TextView text7 = findViewById(R.id.text7);
         editor.putString("MIND_STONE_TEXT", text7.getText().toString());

        editor.commit();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("ResourceType")

    public int Random(View view) {

        r = new Random().nextInt(6) + 1;
        if (r == 1) {
            if (a != 1) {
                i += 1;
                TextView text1 = findViewById(R.id.text1);

                text1.setText("YOU  HAVE  RECEIVED  THE  POWER  STONE - purple");
                ImageView image = findViewById(R.id.image);
                image.setBackground(getResources().getDrawable(R.drawable.powerstone));

                a = r;

            }
            else{
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("BAD  LUCK  / TRY  AGAIN   >");
                image.setBackground(getResources().getDrawable(R.drawable.joker));

                return 0;

            }

        } else if (r == 2) {
            if (b != 2) {
                i += 1;
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("YOU  HAVE  RECEIVED  THE  SPACE  STONE - blue");
                image.setBackground(getResources().getDrawable(R.drawable.spacestone));
                b = r;}
            else{
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("BAD  LUCK  / TRY  AGAIN   >");
                image.setBackground(getResources().getDrawable(R.drawable.joker));

                return 0;
            }

        }


        else if (r == 3) {
            if (c != 3) {
                i += 1;
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("YOU  HAVE  RECEIVED  THE  TIME  STONE - green");
                image.setBackground(getResources().getDrawable(R.drawable.timestone));
                c = r;
            }
            else{
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("BAD  LUCK  / TRY  AGAIN   >");
                image.setBackground(getResources().getDrawable(R.drawable.joker));
                return 0;


            }

        } else if (r == 4) {
            if (d != 4) {
                i += 1;
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("YOU  HAVE  RECEIVED  THE  REALITY  STONE - red");
                image.setBackground(getResources().getDrawable(R.drawable.realitystone));
                d = r;
            }
            else{
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("BAD  LUCK  / TRY  AGAIN   >");
                image.setBackground(getResources().getDrawable(R.drawable.joker));
                return 0;


            }

        } else if (r == 5) {
            if (e != 5) {
                i += 1;
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("YOU  HAVE  RECEIVED  THE  SOUL  STONE - orange");
                image.setBackground(getResources().getDrawable(R.drawable.soulstone));
                e = r;
            }
            else{
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("BAD  LUCK  / TRY  AGAIN   >");
                image.setBackground(getResources().getDrawable(R.drawable.joker));

                return 0;
            }

        } else if (r == 6) {
            if (f != 6) {
                i += 1;
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("YOU  HAVE  RECEIVED  THE  MIND  STONE - yellow");
                image.setBackground(getResources().getDrawable(R.drawable.mindstone));
                f = r;
            }
            else{
                TextView text1 = findViewById(R.id.text1);
                ImageView image = findViewById(R.id.image);
                text1.setText("BAD  LUCK  / TRY  AGAIN   >");
                image.setBackground(getResources().getDrawable(R.drawable.joker));
                return 0;

            }


        }



        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        TextView text5 = findViewById(R.id.text5);
        TextView text6 = findViewById(R.id.text6);
        TextView text7 = findViewById(R.id.text7);


        if (i == 1) {
                      if (k!=1){
                          TextView text1 = findViewById(R.id.text1);
                          text2.setText( text1.getText());
                              k=1;



                      }

        } else if (i == 2) {
            if (l!=2){
                TextView text1 = findViewById(R.id.text1);
                text3.setText( text1.getText());
                l=2;



            }


        } else if (i == 3) {
            if (m!=3){
                TextView text1 = findViewById(R.id.text1);
                text4.setText( text1.getText());
                m=3;



            }


        } else if (i == 4) {
            if (n!=4){
                TextView text1 = findViewById(R.id.text1);
                text5.setText( text1.getText());
                n=4;



            }


        } else if (i == 5) {
            if (o!=5){
                TextView text1 = findViewById(R.id.text1);
                text6.setText( text1.getText());
                o=5;



            }


        } else if (i == 6) {
            if(p!=6) {
                p=6;
                TextView text1 = findViewById(R.id.text1);
                text7.setText(text1.getText());
                Button button = findViewById(R.id.button1);
                button.setVisibility(View.GONE);
                ImageView image = findViewById(R.id.image);
                image.setVisibility(View.GONE);
                text2.setVisibility(View.GONE);
                text3.setVisibility(View.GONE);
                text4.setVisibility(View.GONE);
                text5.setVisibility(View.GONE);
                text6.setVisibility(View.GONE);
                text7.setVisibility(View.GONE);
                text1.setText("YOU  HAVE  SUCCESSFULLY  RECEIVED  ALL  THE  STONE");
                ImageView base = findViewById(R.id.base);
                base.setBackgroundResource(R.drawable.thanos);
                base.setVisibility(View.VISIBLE);
                Button button2 =findViewById(R.id.button2);
                button2.setVisibility(View.INVISIBLE);
                Button button3 =findViewById(R.id.button3);
                button3.setVisibility(View.VISIBLE);



            }
        }

        saveData();
        return 0;

    }

    public void reset(View view){
        a=0;b=0;c=0;d=0;e=0;f=0;i=0;k=0;l=0;m=0;n=0;o=0;p=0;
        ImageView base=findViewById(R.id.base);
        base.setVisibility(View.GONE);
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        TextView text5 = findViewById(R.id.text5);
        TextView text6 = findViewById(R.id.text6);
        TextView text7 = findViewById(R.id.text7);
        Button button = findViewById(R.id.button1);
        button.setVisibility(View.VISIBLE);
        text2.setVisibility(View.VISIBLE);
        text3.setVisibility(View.VISIBLE);
        text4.setVisibility(View.VISIBLE);
        text5.setVisibility(View.VISIBLE);
        text6.setVisibility(View.VISIBLE);
        text7.setVisibility(View.VISIBLE);
        ImageView image = findViewById(R.id.image);
        image.setVisibility(View.VISIBLE);
        image.setBackground(getResources().getDrawable(R.drawable.luck));
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
        text6.setText("");
        text7.setText("");

        saveData();
    }
    public void reset1(View view){
        a=0;b=0;c=0;d=0;e=0;f=0;i=0;k=0;l=0;m=0;n=0;o=0;p=0;
        ImageView base=findViewById(R.id.base);
        base.setVisibility(View.GONE);
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        TextView text5 = findViewById(R.id.text5);
        TextView text6 = findViewById(R.id.text6);
        TextView text7 = findViewById(R.id.text7);
        Button button = findViewById(R.id.button1);
        button.setVisibility(View.VISIBLE);
        text2.setVisibility(View.VISIBLE);
        text3.setVisibility(View.VISIBLE);
        text4.setVisibility(View.VISIBLE);
        text5.setVisibility(View.VISIBLE);
        text6.setVisibility(View.VISIBLE);
        text7.setVisibility(View.VISIBLE);
        ImageView image = findViewById(R.id.image);
        image.setVisibility(View.VISIBLE);
        image.setBackground(getResources().getDrawable(R.drawable.luck));
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
        text6.setText("");
        text7.setText("");
        Button button3 =findViewById(R.id.button3);
        Button button2 =findViewById(R.id.button2);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.INVISIBLE);

        saveData();
    }





}