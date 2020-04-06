package com.company;

public class KsiazkaZOkladkaTwarda extends KsiazkaDekorator {
    protected String okladka;

    public KsiazkaZOkladkaTwarda(Publikacja udekorowanaKsiazka) throws KsiazkaMaOkladkeException {
        super(udekorowanaKsiazka);

        if(udekorowanaKsiazka instanceof KsiazkaZOkladkaTwarda || udekorowanaKsiazka instanceof KsiazkaZOkladkaZwykla) {
            throw new KsiazkaMaOkladkeException("Książka może mieć tylko jedną okładkę!");
        }

        this.okladka = "Okladka twarda";
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
        return udekorowanaKsiazka.toString() + " " + this.okladka + " |";
    }
}
