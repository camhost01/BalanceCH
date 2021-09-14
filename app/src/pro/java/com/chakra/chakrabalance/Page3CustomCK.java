package com.chakra.chakrabalance;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Page3CustomCK extends AppCompatActivity implements View.OnClickListener {

    public MediaPlayer mp;
    private CountDownTimer cdt;
    private CheckBox cbck1,cbck2,cbck3,cbck4,cbck5,cbck6,cbck7;
    private Button btstart,btck7add,btck7les,btck6add,btck6less,btck5add,btck5less,btck4add,btck4less,
                   btck3add,btck3less,btck2add,btck2less,btck1add,btck1less;
    private EditText txtimer7,txtimer6,txtimer5,txtimer4,txtimer3,txtimer2,txtimer1;
    private String value,tiempofaltante;
    private int valor1, check_ck7=0,check_ck6=0,check_ck5=0
                ,check_ck4=0,check_ck3=0,check_ck2=0,check_ck1=0,count=1,pista,flag=0;
    private int valoreschakras[] = new int[8];
    private int activeflag[] = new int[8];


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customscreen_layout);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        activeflag[0]=0;
        activeflag[1]=0;
        activeflag[2]=0;
        activeflag[3]=0;
        activeflag[4]=0;
        activeflag[5]=0;
        activeflag[6]=0;
        activeflag[7]=0;
        valoreschakras[0]=0;
        valoreschakras[1]=0;
        valoreschakras[2]=0;
        valoreschakras[3]=0;
        valoreschakras[4]=0;
        valoreschakras[5]=0;
        valoreschakras[6]=0;
        valoreschakras[7]=0;


        //Checkbox
        cbck1 = (CheckBox) findViewById(R.id.cb_ck1);
        cbck2 = (CheckBox) findViewById(R.id.cb_ck2);
        cbck3 = (CheckBox) findViewById(R.id.cb_ck3);
        cbck4 = (CheckBox) findViewById(R.id.cb_ck4);
        cbck5 = (CheckBox) findViewById(R.id.cb_ck5);
        cbck6 = (CheckBox) findViewById(R.id.cb_ck6);
        cbck7 = (CheckBox) findViewById(R.id.cb_ck7);
        //Buttons
        btstart = (Button)findViewById(R.id.bt_startCustom);
        btck7add = (Button)findViewById(R.id.bt_addck7);
        btck7les = (Button)findViewById(R.id.bt_lessck7);
        btck6add = (Button)findViewById(R.id.bt_addck6);
        btck6less = (Button)findViewById(R.id.bt_lessck6);
        btck5add = (Button)findViewById(R.id.bt_addck5);
        btck5less = (Button)findViewById(R.id.bt_lessck5);
        btck4add = (Button)findViewById(R.id.bt_addck4);
        btck4less = (Button)findViewById(R.id.bt_lessck4);
        btck3add = (Button)findViewById(R.id.bt_addck3);
        btck3less = (Button)findViewById(R.id.bt_lessck3);
        btck2add = (Button)findViewById(R.id.bt_addck2);
        btck2less = (Button)findViewById(R.id.bt_lessck2);
        btck1add = (Button)findViewById(R.id.bt_addck1);
        btck1less = (Button)findViewById(R.id.bt_lessck1);
        //EditText
        txtimer7 = (EditText)findViewById(R.id.edt_timeck7);
        txtimer6 = (EditText)findViewById(R.id.edt_timeck6);
        txtimer5 = (EditText)findViewById(R.id.edt_timeck5);
        txtimer4 = (EditText)findViewById(R.id.edt_timeck4);
        txtimer3 = (EditText)findViewById(R.id.edt_timeck3);
        txtimer2 = (EditText)findViewById(R.id.edt_timeck2);
        txtimer1 = (EditText)findViewById(R.id.edt_timeck1);


        //CAST VALUES
        cbck1.setOnClickListener(this);
        cbck2.setOnClickListener(this);
        cbck3.setOnClickListener(this);
        cbck4.setOnClickListener(this);
        cbck5.setOnClickListener(this);
        cbck6.setOnClickListener(this);
        cbck7.setOnClickListener(this);
        btstart.setOnClickListener(this);
        btck7add.setOnClickListener(this);
        btck7les.setOnClickListener(this);
        btck6add.setOnClickListener(this);
        btck6less.setOnClickListener(this);
        btck5add.setOnClickListener(this);
        btck5less.setOnClickListener(this);
        btck4add.setOnClickListener(this);
        btck4less.setOnClickListener(this);
        btck3add.setOnClickListener(this);
        btck3less.setOnClickListener(this);
        btck2add.setOnClickListener(this);
        btck2less.setOnClickListener(this);
        btck1add.setOnClickListener(this);
        btck1less.setOnClickListener(this);

        btstart.setEnabled(false);

        btck1add.setEnabled(false);
        btck1less.setEnabled(false);
        btck2add.setEnabled(false);
        btck2less.setEnabled(false);
        btck3add.setEnabled(false);
        btck3less.setEnabled(false);
        btck4add.setEnabled(false);
        btck4less.setEnabled(false);
        btck5add.setEnabled(false);
        btck5less.setEnabled(false);
        btck6add.setEnabled(false);
        btck6less.setEnabled(false);
        btck7add.setEnabled(false);
        btck7les.setEnabled(false
        );

    }
    @Override
    public void onBackPressed(){
        if(mp!=null){
            mp.stop();
            mp.release();
            mp=null;
        }
        this.finish();
    }
    //*************************************************************************
    public void resetvalues()
    {
        cbck7.setEnabled(true);
        cbck6.setEnabled(true);
        cbck5.setEnabled(true);
        cbck4.setEnabled(true);
        cbck3.setEnabled(true);
        cbck2.setEnabled(true);
        cbck1.setEnabled(true);
        txtimer1.setText("1");
        txtimer2.setText("1");
        txtimer3.setText("1");
        txtimer4.setText("1");
        txtimer5.setText("1");
        txtimer6.setText("1");
        txtimer7.setText("1");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_startCustom:
                turnoffcb();
                countdownstart();
                break;
            case R.id.bt_lessck7:
                valor1 = Integer.parseInt(txtimer7.getText().toString());
                valor1--;
                if(valor1<1)valor1=1;
                value = Integer.toString(valor1);
                txtimer7.setText(value);
                valoreschakras[7]=Integer.parseInt(txtimer7.getText().toString());
                break;
            case R.id.bt_addck7:
                valor1 = Integer.parseInt(txtimer7.getText().toString());
                valor1++;
                if(valor1>90){
                    valor1=90;
                }
                value = Integer.toString(valor1);
                txtimer7.setText(value);
                valoreschakras[7]=Integer.parseInt(txtimer7.getText().toString());
                break;
            case R.id.cb_ck7:
                checkboxChakra7();
                break;
            //*************************************************************************
            case R.id.cb_ck6:
                checkboxChakra6();
                break;
            case R.id.bt_addck6:
                valor1 = Integer.parseInt(txtimer6.getText().toString());
                valor1++;
                if(valor1>90){
                    valor1=90;
                }
                value = Integer.toString(valor1);
                txtimer6.setText(value);
                valoreschakras[6]=Integer.parseInt(txtimer6.getText().toString());
                break;
            case R.id.bt_lessck6:
                valor1 = Integer.parseInt(txtimer6.getText().toString());
                valor1--;
                if(valor1<1)valor1=1;
                value = Integer.toString(valor1);
                txtimer6.setText(value);
                valoreschakras[6]=Integer.parseInt(txtimer6.getText().toString());
                break;
            //*************************************************************************
            case R.id.cb_ck5:
                checkboxChakra5();
                break;
            case R.id.bt_addck5:
                valor1 = Integer.parseInt(txtimer5.getText().toString());
                valor1++;
                if(valor1>90){
                    valor1=90;
                }
                value = Integer.toString(valor1);
                txtimer5.setText(value);
                valoreschakras[5]=Integer.parseInt(txtimer5.getText().toString());
                break;
            case R.id.bt_lessck5:
                valor1 = Integer.parseInt(txtimer5.getText().toString());
                valor1--;
                if(valor1<1)valor1=1;
                value = Integer.toString(valor1);
                txtimer5.setText(value);
                valoreschakras[5]=Integer.parseInt(txtimer5.getText().toString());
                break;
            //*************************************************************************
            case R.id.cb_ck4:
                checkboxChakra4();
                break;
            case R.id.bt_addck4:
                valor1 = Integer.parseInt(txtimer4.getText().toString());
                valor1++;
                if(valor1>90){
                    valor1=90;
                }
                value = Integer.toString(valor1);
                txtimer4.setText(value);
                valoreschakras[4]=Integer.parseInt(txtimer4.getText().toString());
                break;
            case R.id.bt_lessck4:
                valor1 = Integer.parseInt(txtimer4.getText().toString());
                valor1--;
                if(valor1<1)valor1=1;
                value = Integer.toString(valor1);
                txtimer4.setText(value);
                valoreschakras[4]=Integer.parseInt(txtimer4.getText().toString());
                break;
            //*************************************************************************
            case R.id.cb_ck3:
                checkboxChakra3();
                break;
            case R.id.bt_addck3:
                valor1 = Integer.parseInt(txtimer3.getText().toString());
                valor1++;
                if(valor1>90){
                    valor1=90;
                }
                value = Integer.toString(valor1);
                txtimer3.setText(value);
                valoreschakras[3]=Integer.parseInt(txtimer3.getText().toString());
                break;
            case R.id.bt_lessck3:
                valor1 = Integer.parseInt(txtimer3.getText().toString());
                valor1--;
                if(valor1<1)valor1=1;
                value = Integer.toString(valor1);
                txtimer3.setText(value);
                valoreschakras[3]=Integer.parseInt(txtimer3.getText().toString());
                break;
            //*************************************************************************
            case R.id.cb_ck2:
                checkboxChakra2();
                break;
            case R.id.bt_addck2:
                valor1 = Integer.parseInt(txtimer2.getText().toString());
                valor1++;
                if(valor1>90){
                    valor1=90;
                }
                value = Integer.toString(valor1);
                txtimer2.setText(value);
                valoreschakras[2]=Integer.parseInt(txtimer2.getText().toString());
                break;
            case R.id.bt_lessck2:
                valor1 = Integer.parseInt(txtimer2.getText().toString());
                valor1--;
                if(valor1<1)valor1=1;
                value = Integer.toString(valor1);
                txtimer2.setText(value);
                valoreschakras[2]=Integer.parseInt(txtimer2.getText().toString());
                break;
            //*************************************************************************
            case R.id.cb_ck1:
                checkboxChakra1();
                break;
            case R.id.bt_addck1:
                valor1 = Integer.parseInt(txtimer1.getText().toString());
                valor1++;
                if(valor1>90){
                    valor1=90;
                }
                value = Integer.toString(valor1);
                txtimer1.setText(value);
                valoreschakras[1]=Integer.parseInt(txtimer1.getText().toString());
                break;
            case R.id.bt_lessck1:
                valor1 = Integer.parseInt(txtimer1.getText().toString());
                valor1--;
                if(valor1<1)valor1=1;
                value = Integer.toString(valor1);
                txtimer1.setText(value);
                valoreschakras[1]=Integer.parseInt(txtimer1.getText().toString());
                break;
        }

    }
    //*************************************************************************
    private void turnoffcb(){
        if(cbck7.isChecked()==true)
        {
            cbck7.setChecked(false);
            btck7les.setEnabled(false);
            btck7add.setEnabled(false);
        }
        if(cbck6.isChecked()==true)
        {
            cbck6.setChecked(false);
            btck6less.setEnabled(false);
            btck6add.setEnabled(false);
        }
        if(cbck5.isChecked()==true)
        {
            cbck5.setChecked(false);
            btck5less.setEnabled(false);
            btck5add.setEnabled(false);
        }
        if(cbck4.isChecked()==true)
        {
            cbck4.setChecked(false);
            btck4less.setEnabled(false);
            btck4add.setEnabled(false);
        }
        if(cbck3.isChecked()==true)
        {
            cbck3.setChecked(false);
            btck3less.setEnabled(false);
            btck3add.setEnabled(false);
        }
        if(cbck2.isChecked()==true)
        {
            cbck2.setChecked(false);
            btck2less.setEnabled(false);
            btck2add.setEnabled(false);
        }
        if(cbck1.isChecked()==true)
        {
            cbck1.setChecked(false);
            btck1less.setEnabled(false);
            btck1add.setEnabled(false);
        }
        btstart.setEnabled(false);
        cbck7.setEnabled(false);
        cbck6.setEnabled(false);
        cbck5.setEnabled(false);
        cbck4.setEnabled(false);
        cbck3.setEnabled(false);
        cbck2.setEnabled(false);
        cbck1.setEnabled(false);
    }
    //*************************************************************************
    private void statuscheckbox() {
        if(cbck7.isChecked()==true) {
            flag=1;
        }else if(cbck6.isChecked()==true){
            flag=1;
        }else if(cbck5.isChecked()==true) {
            flag=1;
        }else if(cbck4.isChecked()==true){
            flag=1;
        }else if(cbck3.isChecked()==true) {
            flag=1;
        }else if(cbck2.isChecked()==true){
            flag=1;
            cbck2.setChecked(false);
        }else if(cbck1.isChecked()==true){
            flag=1;
        }else {
            btstart.setEnabled(false);
            flag = 0;
        }
    }
//*************************************************************************
    private void countdownstart() {
            cargarpista(flag);
    }
    //*************************************************************************
    private void reprodictpista(int valoreschakra) {
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                if(count < valoreschakra) {
                    count++;
                    mediaPlayer.seekTo(1000);
                    mediaPlayer.start();
                    activeflag[pista]=0;
                }
                else
                {
                        activeflag[pista]=0;
                        mp.release();
                        mp=null;
                        count=1;
                        cargarpista(flag);
                        if(mp==null){
                            Toast.makeText(getApplicationContext(),"Termino",Toast.LENGTH_SHORT).show();
                            resetvalues();
                        }
                }
            }});
    }
    //*************************************************************************
    private void cargarpista(int flag) {
        int match=0;
        while(match==0){
            switch (flag){
                case 1:
                    if(flag==activeflag[flag])
                    {
                        if(mp==null)
                        {
                            mp = MediaPlayer.create(getApplicationContext(), R.raw.chakra1);
                            mp.start();
                            pista=1;
                            reprodictpista(valoreschakras[flag]);
                            int tiempoact = valoreschakras[1]*60000;
                            cdt = new CountDownTimer(tiempoact,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    int minut = (int) millisUntilFinished / 60000;
                                    int sec = (int) millisUntilFinished % 60000 / 1000;
                                    tiempofaltante = "" + minut;
                                    tiempofaltante += ":";
                                    if(sec < 10)tiempofaltante +="0";
                                    tiempofaltante += sec;
                                    txtimer1.setText(tiempofaltante);
                                }

                                @Override
                                public void onFinish() {

                                }
                            }.start();
                        }

                    }
                    break;
                case 2:
                    if(flag==activeflag[flag])
                    {
                        if(mp==null)
                        {
                            mp = MediaPlayer.create(getApplicationContext(), R.raw.chakra2);
                            mp.start();
                            pista=2;
                            reprodictpista(valoreschakras[flag]);
                            int tiempoact = valoreschakras[2]*60000;
                            cdt = new CountDownTimer(tiempoact,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    int minut = (int) millisUntilFinished / 60000;
                                    int sec = (int) millisUntilFinished % 60000 / 1000;
                                    tiempofaltante = "" + minut;
                                    tiempofaltante += ":";
                                    if(sec < 10)tiempofaltante +="0";
                                    tiempofaltante += sec;
                                    txtimer2.setText(tiempofaltante);
                                }

                                @Override
                                public void onFinish() {

                                }
                            }.start();
                        }

                    }
                    break;
                case 3:
                    if(flag==activeflag[flag])
                    {
                        if(mp==null)
                        {
                            mp = MediaPlayer.create(getApplicationContext(), R.raw.chakra3);
                            mp.start();
                            pista=3;
                            reprodictpista(valoreschakras[flag]);
                            int tiempoact = valoreschakras[3]*60000;
                            cdt = new CountDownTimer(tiempoact,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    int minut = (int) millisUntilFinished / 60000;
                                    int sec = (int) millisUntilFinished % 60000 / 1000;
                                    tiempofaltante = "" + minut;
                                    tiempofaltante += ":";
                                    if(sec < 10)tiempofaltante +="0";
                                    tiempofaltante += sec;
                                    txtimer3.setText(tiempofaltante);
                                }

                                @Override
                                public void onFinish() {

                                }
                            }.start();
                        }

                    }
                    break;
                case 4:
                    if(flag==activeflag[flag])
                    {
                        if(mp==null)
                        {
                            mp = MediaPlayer.create(getApplicationContext(), R.raw.chakra4);
                            mp.start();
                            pista=4;
                            reprodictpista(valoreschakras[flag]);
                            int tiempoact = valoreschakras[4]*60000;
                            cdt = new CountDownTimer(tiempoact,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    int minut = (int) millisUntilFinished / 60000;
                                    int sec = (int) millisUntilFinished % 60000 / 1000;
                                    tiempofaltante = "" + minut;
                                    tiempofaltante += ":";
                                    if(sec < 10)tiempofaltante +="0";
                                    tiempofaltante += sec;
                                    txtimer4.setText(tiempofaltante);
                                }

                                @Override
                                public void onFinish() {

                                }
                            }.start();
                        }

                    }
                    break;
                case 5:
                    if(flag==activeflag[flag])
                    {
                        if(mp==null)
                        {
                            mp = MediaPlayer.create(getApplicationContext(), R.raw.chakra5);
                            mp.start();
                            pista=5;
                            reprodictpista(valoreschakras[flag]);
                            int tiempoact = valoreschakras[5]*60000;
                            cdt = new CountDownTimer(tiempoact,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    int minut = (int) millisUntilFinished / 60000;
                                    int sec = (int) millisUntilFinished % 60000 / 1000;
                                    tiempofaltante = "" + minut;
                                    tiempofaltante += ":";
                                    if(sec < 10)tiempofaltante +="0";
                                    tiempofaltante += sec;
                                    txtimer5.setText(tiempofaltante);

                                }

                                @Override
                                public void onFinish() {

                                }
                            }.start();
                        }

                    }
                    break;
                case 6:
                    if(flag==activeflag[flag])
                    {
                        if(mp==null)
                        {
                            mp = MediaPlayer.create(getApplicationContext(), R.raw.chakra6);
                            mp.start();
                            match = 1;
                            pista = 6;
                            reprodictpista(valoreschakras[flag]);
                            int tiempoact = valoreschakras[6]*60000;
                           cdt = new CountDownTimer(tiempoact,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    int minut = (int) millisUntilFinished / 60000;
                                    int sec = (int) millisUntilFinished % 60000 / 1000;
                                    tiempofaltante = "" + minut;
                                    tiempofaltante += ":";
                                    if(sec < 10)tiempofaltante +="0";
                                    tiempofaltante += sec;
                                    txtimer6.setText(tiempofaltante);

                                }

                                @Override
                                public void onFinish() {
                                    txtimer6.setText(tiempofaltante);
                                }
                            }.start();
                        }
                    }
                    break;
                case 7:
                    if(flag==activeflag[flag])
                    {
                        if(mp==null) {
                            mp = MediaPlayer.create(getApplicationContext(), R.raw.chakra7);
                            mp.start();
                            match = 1;
                            pista = 7;
                            reprodictpista(valoreschakras[flag]);
                            int tiempoact = valoreschakras[7]*60000;
                            cdt = new CountDownTimer(tiempoact,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    int minut = (int) millisUntilFinished / 60000;
                                    int sec = (int) millisUntilFinished % 60000 / 1000;
                                    tiempofaltante = "" + minut;
                                    tiempofaltante += ":";
                                    if(sec < 10)tiempofaltante +="0";
                                    tiempofaltante += sec;
                                    txtimer7.setText(tiempofaltante);

                                }

                                @Override
                                public void onFinish() {
                                }
                            }.start();
                        }
                    }
            }
            if(flag>7){
               match=1;
            }else{
                flag++;
            }

        }
        match=0;
    }
    //*************************************************************************
    private void checkboxChakra7(){
        if(check_ck7==0) {
            while (cbck7.isChecked() == false) {
            }
            valoreschakras[7]=Integer.parseInt(txtimer7.getText().toString());
            activeflag[7]=7;
            btstart.setEnabled(true);
            btck7add.setEnabled(true);
            btck7les.setEnabled(true);
        }
        check_ck7++;
        if(check_ck7==2)
        {
            activeflag[7]=0;
            check_ck7=0;
            cbck7.setChecked(false);
            btck7add.setEnabled(false);
            btck7les.setEnabled(false);
            statuscheckbox();
        }
    }
    //*************************************************************************
    private void checkboxChakra6(){
        if(check_ck6==0) {
            while (cbck6.isChecked() == false) {
            }
            valoreschakras[6]=Integer.parseInt(txtimer6.getText().toString());
            activeflag[6]=6;
            btstart.setEnabled(true);
            btck6add.setEnabled(true);
            btck6less.setEnabled(true);
        }
        check_ck6++;
        if(check_ck6==2)
        {
            activeflag[6]=0;
            check_ck6=0;
            cbck6.setChecked(false);
            btck6add.setEnabled(false);
            btck6less.setEnabled(false);
            statuscheckbox();
        }
    }
    //*************************************************************************
    private void checkboxChakra5(){
        if(check_ck5==0) {
            while (cbck5.isChecked() == false) {
            }
            valoreschakras[5]=Integer.parseInt(txtimer5.getText().toString());
            activeflag[5]=5;
            btstart.setEnabled(true);
            btck5add.setEnabled(true);
            btck5less.setEnabled(true);
        }
        check_ck5++;
        if(check_ck5==2)
        {
            activeflag[5]=0;
            check_ck5=0;
            cbck5.setChecked(false);
            btck5add.setEnabled(false);
            btck5less.setEnabled(false);
            statuscheckbox();
        }
    }
    //*************************************************************************
    private void checkboxChakra4(){
        if(check_ck4==0) {
            while (cbck4.isChecked() == false) {
            }
            valoreschakras[4]=Integer.parseInt(txtimer4.getText().toString());
            activeflag[4]=4;
            btstart.setEnabled(true);
            btck4add.setEnabled(true);
            btck4less.setEnabled(true);
        }
        check_ck4++;
        if(check_ck4==2)
        {
            activeflag[4]=0;
            check_ck4=0;
            cbck4.setChecked(false);
            btck4add.setEnabled(false);
            btck4less.setEnabled(false);
            statuscheckbox();
        }
    }
    //*************************************************************************
    private void checkboxChakra3(){
        if(check_ck3==0) {
            while (cbck3.isChecked() == false) {
            }
            valoreschakras[3]=Integer.parseInt(txtimer3.getText().toString());
            activeflag[3]=3;
            btstart.setEnabled(true);
            btck3add.setEnabled(true);
            btck3less.setEnabled(true);
        }
        check_ck3++;
        if(check_ck3==2)
        {
            activeflag[3]=0;
            check_ck3=0;
            cbck3.setChecked(false);
            btck3add.setEnabled(false);
            btck3less.setEnabled(false);
            statuscheckbox();
        }
    }
    //*************************************************************************
    private void checkboxChakra2(){
        if(check_ck2==0) {
            while (cbck2.isChecked() == false) {
            }
            valoreschakras[2]=Integer.parseInt(txtimer2.getText().toString());
            activeflag[2]=2;
            btstart.setEnabled(true);
            btck2add.setEnabled(true);
            btck2less.setEnabled(true);
        }
        check_ck2++;
        if(check_ck2==2)
        {
            activeflag[2]=0;
            check_ck2=0;
            cbck2.setChecked(false);
            btck2add.setEnabled(false);
            btck2less.setEnabled(false);
            statuscheckbox();
        }
    }
    //*************************************************************************
    private void checkboxChakra1(){
        if(check_ck1==0) {
            while (cbck1.isChecked() == false) {
            }
            valoreschakras[1]=Integer.parseInt(txtimer1.getText().toString());
            activeflag[1]=1;
            btstart.setEnabled(true);
            btck1add.setEnabled(true);
            btck1less.setEnabled(true);
        }
        check_ck1++;
        if(check_ck1==2)
        {
            activeflag[1]=0;
            check_ck1=0;
            cbck1.setChecked(false);
            btck1add.setEnabled(false);
            btck1less.setEnabled(false);
            statuscheckbox();
        }
    }
}