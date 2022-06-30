package com.example.modul_1_zaniatie_7_dom_3_2_onlyonelogstringresult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//adding ArrayList of logins already registered
        ArrayList<String> listLogin = new ArrayList<>();
        listLogin.add("luda1990");
        listLogin.add("valera1122");
        listLogin.add("kingofeverything");
        listLogin.add("workhardplayhard");

        String login = "powershot";
        String email = "donthesitate2222@mail.com";
        String password = "12345abc";
        String confirmPassword = "12345abc";
        int age = 18;
        String address = "Ukraine, Kyiv, Khreschatyk st., 26, 01001";

        String emailCheck = "@.";
        String emailInput = "";
        //can be done as: int emailCheck = 0;
        //search for "@". if "@" was found, then emailCheck += 1; 'emailCheck = 1'
        //then search for ".". if "." was found, then emailCheck += 1; 'emailCheck = 2'
        //if (emailCheck == 2) > OK, else > something wasn't found
        String countryCheck = "Ukraine";
        String countryInput = "";

//login check
        for (int i = 0; i < listLogin.size(); i++){
            if (login.equals(listLogin.get(i))){
                Log.d("MYLOG", "This login is already taken. Please, choose another one.");
                break;
            }else if (i == listLogin.size()-1){

                //email check
                for (int i1 = 0; i1 < email.length(); i1++){
                    String emailChar = String.valueOf(email.charAt(i1));
                //search @ and .
                    if (emailChar.equals("@")){
                        emailInput += emailChar;
                    }else if (emailChar.equals(".")){
                        emailInput += emailChar;
                    }
                }

                if (emailInput.equals(emailCheck)){

                    //password check
                    if (password.equals(confirmPassword)){

                        //age check
                        if (age >= 18){

                            //country check
                            for (int i2 = 0; i2 < address.length(); i2++){
                                String addressChar = String.valueOf(address.charAt(i2));
                                if (addressChar.equals(",") || addressChar.equals(" ")){
                                    countryInput = "";
                                }else {
                                    countryInput = countryInput + addressChar;
                                }
                                if (countryInput.equals(countryCheck)){
                                    Log.d("MYLOG", "You have been successfully registered!");
                                    break;
                                }
                                if ((i2 == address.length()-1) && (!countryInput.equals(countryCheck))){
                                    Log.d("MYLOG", "Excuse me. We don't support customers outside the " + countryCheck);
                                }
                            }
                            //country check can be done as:
                            //add ArrayList 'countryCheck' of all countries. Then compare countryInput with ArrayList 'countryCheck'

                        }else {
                            Log.d("MYLOG", "Your age is less than 18 years. Please, try again later.");
                        }

                    }else {
                        Log.d("MYLOG", "Check password. You put in different passwords.");
                    }

                }else {
                    Log.d("MYLOG", "Please, check your email. Something wrong.");
                }

            }


        }





    }
}