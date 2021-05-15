package com.company;

public class Pracownik extends User {
    private int liczbaGodzin;

    public Pracownik(Long id, String imie, String nazwisko, int liczbaGodzin) {
        super(id, imie, nazwisko);
        this.liczbaGodzin = liczbaGodzin;
    }
}
