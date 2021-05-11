package com.example.miwok;

public class Word {
    private String engWord, miwokWord;

    public Word(String eng, String miwok) {
        engWord = eng;
        miwokWord = miwok;
    }
    public String getEngWord() {
        return engWord;
    }
    public String getMiwokWord() {
        return miwokWord;
    }
}
