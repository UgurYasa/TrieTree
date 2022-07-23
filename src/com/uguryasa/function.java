package com.uguryasa;

public class function {
    trie kok=null;
    int i;
    public void ekle(String eklenecek){
        int uzunluk=eklenecek.length();
        if (kok==null){
            trie yeni=new trie();
            yeni.setSayac(0);
            kok=yeni;
        }
        trie temp=kok;
        for (i=0;i<uzunluk;++i){

            int deger=eklenecek.charAt(i);

            if (temp.next[deger]==null){
                trie yeni=new trie();
                temp.next[deger]=yeni;
                temp=yeni;


            }
            else {
                temp=temp.next[deger];


            }

        }
        temp.setDurum(1);

    }

    public void ara(String aranacak){
        trie temp = kok;
        int uzunluk = aranacak.length();

        for (i=0;i<uzunluk;++i){
            int deger=aranacak.charAt(i);

            if (temp.next[deger]!=null)
                temp=temp.next[deger];
            else break;
        }
        if (temp.getDurum()==1)
            System.out.println("VAR");
        else
            System.out.println("YOK");
    }
}


