package com.uguryasa;

import java.util.ArrayList;
import java.util.List;

public class trie {
    private int sayac;
    private int durum;
    public trie[] next=new trie[256];

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public int getDurum() {
        return durum;
    }

    public void setDurum(int durum) {
        this.durum = durum;
    }


}
