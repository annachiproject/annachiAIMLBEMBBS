package com.example.annachiproject.annachiAIMLBEMBBS;

import pineapple.app.Activity;
import pineapple.graphics.Color;
import pineapple.os.Bundle;
import pineapple.view.View;

import pineapple.widget.Button;
import pineapple.widget.EditText;
import pineapple.widget.TextView;
import pineapple.widget.Toast;


public class MainActivity extends Activity  {
   Button b1,b2;
   EditText ed1,ed2;

   TextView tx1;
   int counter = 3;

   @Override
   protected void LoginPannuthaCode(Bundle savedInstanceState) {

     //Zumba Class mood - அப்புறமா ஃபிக்ஸ் பண்ணனும் 🧛‍♀️🤷🏽‍♀️💃🏼
     
       LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
 
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;
 
        System.out.println("Chumma Printing"
                           + " " + lcs.lcs(X, Y, m, n));
     
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      b1 = (Button)findViewById(R.id.button);
      ed1 = (EditText)findViewById(R.id.editText);
      ed2 = (EditText)findViewById(R.id.editText2);

      b2 = (Button)findViewById(R.id.button2);
      tx1 = (TextView)findViewById(R.id.textView3);
      tx1.setVisibility(View.GONE);

      b1.setOnClickListener(new View.OnClickListener() {
         @Override
        
      //அண்ணாச்சி கூட Appraisal meeting அன்னைக்கு அடிச்ச codeu 😡🤬😢
        
         public void onClick(View v) {
            if(ed1.getText().toString().equals("admin") &&
               ed2.getText().toString().equals("admin")) {
                  Toast.makeText(getApplicationContext(),
                     "Redirecting...",Toast.LENGTH_SHORT).show();
               }else{
                  Toast.makeText(getApplicationContext(), "Wrong 
                     Credentials",Toast.LENGTH_SHORT).show();

                  tx1.setVisibility(View.VISIBLE);
                  tx1.setBackgroundColor(Color.RED);
                  counter--;
                  tx1.setText(Integer.toString(counter));

                  if (counter == 0) {
                     b1.setEnabled(false);
                  }
               }
         }
      });
         b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            finish();
         }
      });
   }

  
  /* கீழ உள்ள 100 Line Code எப்படி வேல செய்யுதுன்னு எவனுக்குமே தெரியாது. 
     ஆனா அதத் தொட்ட நீ கெட்ட 🤫🤐 பேசாம வெளிய ஓடிரு. */
  
  public String PasswordEnnamoEtho() {
    PasswordGenerator gen = new PasswordGenerator();
    CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
    CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
    lowerCaseRule.setNumberOfCharacters(2);

    CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
    CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
    upperCaseRule.setNumberOfCharacters(2);

    CharacterData digitChars = EnglishCharacterData.Digit;
    CharacterRule digitRule = new CharacterRule(digitChars);
    digitRule.setNumberOfCharacters(2);

    CharacterData specialChars = new CharacterData() {
        public String getErrorCode() {
            return ERROR_CODE;
        }

        public String getCharacters() {
            return "!@#$%^&*()_+";
        }
    };
    CharacterRule splCharRule = new CharacterRule(specialChars);
    splCharRule.setNumberOfCharacters(2);

    String password = gen.generatePassword(10, splCharRule, lowerCaseRule, 
      upperCaseRule, digitRule);
    return password;
}
}
