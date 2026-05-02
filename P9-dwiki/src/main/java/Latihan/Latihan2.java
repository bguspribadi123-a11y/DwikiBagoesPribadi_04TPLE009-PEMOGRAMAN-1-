/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class Latihan2 {
    public static void main(String[] args) {
        String nama = "";

        nama = JOptionPane.showInputDialog("Ketik nama anda : ");
        String msg = "Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer Java !";
        
        JOptionPane.showMessageDialog(null, msg);
    }
}