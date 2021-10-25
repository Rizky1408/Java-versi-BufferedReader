package com.LatihanJOP;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String pil = "";
        pil = JOptionPane.showInputDialog("1. Menggunakan If\n2. Menggunakan Switch");
        int pilihan = Integer.valueOf(pil).intValue();

        String angka =" ";
        String hasil =" ";

        if(pilihan == 1){
            angka = JOptionPane.showInputDialog("Silahkan Masukan Angka :");
            int bil = Integer.valueOf(angka).intValue();

            if(bil >= 1 & bil <= 10){
                hasil += "Valid Number";
            }else {
                hasil += "Invalid Number";
            }
            JOptionPane.showMessageDialog(null,hasil);
        }else if(pilihan == 2){
            angka = JOptionPane.showInputDialog("Silahkan Masukan Angka :");
            int bil = Integer.valueOf(angka).intValue();


            switch(bil){
                case 1 :
                    hasil += "Valid number";
                    break;

                case 2 :
                    hasil += "Valid number";
                    break;

                case 3 :
                    hasil += "Valid number";
                    break;

                case 4 :
                    hasil += "Valid number";
                    break;

                case 5 :
                    hasil += "Valid number";
                    break;

                case 6 :
                    hasil += "Valid number";
                    break;

                case 7 :
                    hasil += "Valid number";
                    break;

                case 8 :
                    hasil += "Valid number";
                    break;

                case 9 :
                    hasil += "Valid number";
                    break;

                case 10 :
                    hasil += "Valid number";
                    break;

                default :
                    hasil += "Invalid number";
                    break;
            }
            JOptionPane.showMessageDialog(null,hasil);
        }else {
            hasil += "Pilihan invalid";
        }

        JOptionPane.showMessageDialog(null,hasil);
    }
}