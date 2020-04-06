package com.company;

public class Main {

    public static void main(String[] args) {

        Publikacja k1 = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
        Publikacja k2 = new Ksiazka("Adam Mickiewicz", "Dziady", 130);
        System.out.println(k1);
        System.out.println(k2);
        Publikacja kk1 = null, kk2 = null;

        try {
            kk1 = new KsiazkaZOkladkaZwykla(k1);
            System.out.println(kk1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            kk2 = new KsiazkaZOkladkaTwarda(k2);
            System.out.println(kk2);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Publikacja fakeBook = null;

        try {
            fakeBook = new KsiazkaZObwoluta(k1);
            System.out.println(fakeBook);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Publikacja kkk2 = null;

        try {
            kkk2 = new KsiazkaZObwoluta(kk2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(kkk2);
        Publikacja dziadyZAutografemWieszcza = null;

        try {
            dziadyZAutografemWieszcza = new KsiazkaZAutografem(kkk2, "Drogiej Hani - Adam Mickiewicz");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(dziadyZAutografemWieszcza);
        Publikacja dziadyZDwomaAutografami = null;

        try {
            dziadyZDwomaAutografami = new KsiazkaZAutografem(dziadyZAutografemWieszcza, "Haniu, to nieprawda, Dziady napisałem ja, Julek Słowacki!");
            System.out.println(dziadyZDwomaAutografami);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
