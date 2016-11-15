package com.example.android.miwok;

/**
 * Created by User18 on 2016/11/12.
 * it will contain miwork and english words
 */

public class Word {

    //english translation
    private String mDefaultTranslation;

    //miwork translation word
    private String mMiworkTranslation;

    //building a constractor for this two words english and miwork variable
    public Word (String defaultTranslation, String miworkTranslation)
    {
        this.mDefaultTranslation= defaultTranslation;
        this.mMiworkTranslation= miworkTranslation;
    }




    //returning the default/english translation of the word
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    //retun the miwork transilation
   public String getmMiworkTranslation()
   {
       return mMiworkTranslation;
   }

}
