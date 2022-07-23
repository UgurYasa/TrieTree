package com.uguryasa;

public class Main {

    public static void main(String[] args) {
        String kelime="ADANA";
        String kelime2="ADA";
        String kelime3="EDIRNE";
        function deneme=new function();
        deneme.ekle(kelime);
        deneme.ekle(kelime2);
        deneme.ekle(kelime3);
        deneme.ara("EDIRNE");
        System.out.println(deneme);
    }
}
