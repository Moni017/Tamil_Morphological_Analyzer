package com.org.morph.tamil;

import java.util.List;

/**
 * Created by pranavan on 19/06/15.
 */
public class TamilFontEntity {
    private List<String> unicodeList;
    private String charList;
    private int xLocation;
    private int yLocation;
    private int x;
    private boolean isTamilLetter;

    /**
     * constructor for basic tamil alphabets
     * @param unicodeList
     * @param xLocation
     * @param yLocation
     */
    public TamilFontEntity(List<String> unicodeList, int xLocation, int yLocation){
        this.unicodeList = unicodeList;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        isTamilLetter = true;
    }

    /**
     * constructor for tamil body, live, and weapon alphabets
     * @param unicodeList
     * @param x
     */
    public TamilFontEntity(List<String> unicodeList, int x){
        this.unicodeList = unicodeList;
        this.x = x;
        isTamilLetter = true;
    }

    public TamilFontEntity(String charList){
        this.charList = charList;
        isTamilLetter = false;
    }

    public List<String> getUnicodeList() {
        return unicodeList;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void setUnicodeList(List<String> unicodeList) {
        this.unicodeList = unicodeList;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    @Override
    public String toString() {
        if(isTamilLetter){
            String str = "";

            for(String s : unicodeList){
                str = str + s;
            }
            return str;
        } else {
            return charList;
        }

    }

    public boolean isTamilLetter(){
        return isTamilLetter;
    }
}
