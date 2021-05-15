package com.company;

import javax.xml.crypto.Data;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        User kasia = new User(1L,"Kasia", "Nowak");
        User jan = new User(2L,"Jan", "Nowak");


        DataBase db = new DataBase();
        db.add(kasia);
        db.add(jan);

       User user = db.findmyid(2L);
        System.out.println(user);

        db.updateName("piotr", 2L);
        user = db.findmyid(2L);
        System.out.println(user + " hello world!");

        db.daleteuser(1L);
        boolean b1 = db.isexist(1L);
        boolean b2 = db.isexist(2L);
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("HBello");

        Collection<User> lista = db.lista();

        User pracownik = new Pracownik(3L, "Jacek", "kowalski", 13);
        User szef = new Szef(4L, "Stasiek", "nowak", 14);

        db.add(pracownik);
        db.add(szef);


    }
}
