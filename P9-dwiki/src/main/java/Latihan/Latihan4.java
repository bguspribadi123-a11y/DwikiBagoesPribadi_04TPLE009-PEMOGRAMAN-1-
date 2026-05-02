/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author User
 */
import java.text.*;
import java.util.*;

public class Latihan4 {
    public static void main(String args[]) {
        double Angka = 8324363.342245;
        double AngkaPecahan = 0.902235643;

        NumberFormat NumberFormatterGERMANY =
            NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat CurrFormatterGERMANY =
            NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat PercentFormatterGERMANY =
            NumberFormat.getPercentInstance(Locale.GERMANY);

        String NumberStrGERMANY = NumberFormatterGERMANY.format(Angka);
        String CurrStrGERMANY = CurrFormatterGERMANY.format(Angka);
        String PercentStrGERMANY = PercentFormatterGERMANY.format(AngkaPecahan);

        System.out.println("Format Jerman Number : " + NumberStrGERMANY);
        System.out.println("Format Jerman Currency : " + CurrStrGERMANY);
        System.out.println("Format Jerman Percent : " + PercentStrGERMANY);
    }
}