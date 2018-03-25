/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis.anddanzan.zadaca_1;

/**
 * Klasa za pohranu podataka o IOT uređaju za mjerenje jačine vjetra
 * @author Andrea
 */
public class IOTVjetar extends IOT{
    int brzinaVjetra;

    /**
     * Konstruktor
     * @param id identifikator uređaja
     * @param lokacija lokacija uređaja
     * @param brzinaVjetra izmjerena brzina vjetra
     * @param vrijemeMjerenja vrijeme mjerenja zadano u milisekundama
     */
    public IOTVjetar(int id, String lokacija, int brzinaVjetra, long vrijemeMjerenja) {
        this.id = id;
        this.lokacija = lokacija;
        this.brzinaVjetra = brzinaVjetra;
        this.vrijemeMjerenjaMilisekunde = vrijemeMjerenja;
    }

    /**
     * Getter za dohvaćanje brzine vjetra
     * @return vraća <code>int</code> varijablu s vrijednosti temeprature
     */
    public int dohvatiBrzinuVjetra() {
        return brzinaVjetra;
    }

    /**
     * Setter za postavljanje nove vrijednosti brzine vjetra
     * @param brzinaVjetra nova mjerenja brzine vjetra za pohranu u klasu
     */
    public void postaviBrzinuVjetra(int brzinaVjetra) {
        this.brzinaVjetra = brzinaVjetra;
    }

    /**
     * Metoda InterfeceIOT koja definira vraćanje vrijednosti mjerenja svakog IOT uređaja
     * @return string vrijednost mjerenja
     */
    @Override
    public String vrijednostMjerenja() {
        return String.valueOf(this.brzinaVjetra);
    }
    
    
}
