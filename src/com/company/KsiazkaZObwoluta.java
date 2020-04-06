package com.company;

public class KsiazkaZObwoluta extends KsiazkaDekorator {
    protected String obwoluta;

    public KsiazkaZObwoluta(Publikacja udekorowanaKsiazka) throws KsiazkaBrakOkladkiException, KsiazkaMaObwoluteException {
        super(udekorowanaKsiazka);

        if(udekorowanaKsiazka instanceof Ksiazka) {
            throw new KsiazkaBrakOkladkiException("Nie można obłożyć obwolutą książki, która nie posiada okładki!");
        }

        if(udekorowanaKsiazka instanceof KsiazkaZObwoluta) {
            throw new KsiazkaMaObwoluteException("Obwoluta może być jedna!");
        }

        this.obwoluta = "Z obwoluta";

    }


    @Override
    public String getAutor() {
        return udekorowanaKsiazka.getAutor();
    }

    @Override
    public String getTytul() {
        return udekorowanaKsiazka.getTytul();
    }

    @Override
    public int getStrony() {
        return udekorowanaKsiazka.getStrony();
    }

    @Override
    public String toString() {
        return this.udekorowanaKsiazka.toString() + " " + this.obwoluta + " |";
    }
}
