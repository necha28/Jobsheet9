/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author necha
 */
public class Challenge2 {
    public static void main(String[] args) {
        int nilai [] = new int [5];
        nilai [0]=78;
        nilai [1]=89;
        nilai [2]=90;
        nilai [3]=100;
        nilai [4]=95;
        //deklarasi
        double ratarata = 0.0;
        for (int i=0; i<nilai.length; i++)ratarata+=nilai [i];
        ratarata/=nilai.length;
        System.out.println("Nilai rata-rata = "+ ratarata);
        if (ratarata <=75) {
        System.out.println("Nilai rata-rata rendah");
    } else{
            System.out.println("Nilai rata-rata tinggi");
        
        }
    }
}
