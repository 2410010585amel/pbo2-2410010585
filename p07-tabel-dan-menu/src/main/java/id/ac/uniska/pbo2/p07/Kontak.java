/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

/**
 * Kategori kontak. Nilai dari toString() dipakai sebagai teks di JComboBox dan tabel.
 * 
 * @author amell
 */
public record Kontak(String nama, String telepon, String email, Kategori kategori) {
}