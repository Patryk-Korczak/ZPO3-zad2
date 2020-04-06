package com.company;

public class KsiazkaZOkladkaZwykla extends KsiazkaDekorator {
    protected String okladka;


    public KsiazkaZOkladkaZwykla(Publikacja udekorowanaKsiazka) throws KsiazkaMaOkladkeException {
        super(udekorowanaKsiazka);

        if(udekorowanaKsiazka instanceof KsiazkaZOkladkaTwarda || udekorowanaKsiazka instanceof KsiazkaZOkladkaZwykla) {
            throw new KsiazkaMaOkladkeException("Książka może mieć tylko jedną okładkę!");
        }

        this.okladka = "Okladka zwykla";
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
