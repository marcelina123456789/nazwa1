package com.company;

public class Szef extends User {
    private double premia;

    public Szef(Long id, String imie, String nazwisko, double premia) {
        super(id, imie, nazwisko);
        this.premia = premia;
    }
}
