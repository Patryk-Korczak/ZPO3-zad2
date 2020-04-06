package com.company;

public class KsiazkaZAutografem extends KsiazkaDekorator {
    protected String autograf;

    public KsiazkaZAutografem(Publikacja udekorowanaKsiazka, String autograf) throws KsiazkaMaAutografException {
        super(udekorowanaKsiazka);

        if(udekorowanaKsiazka instanceof KsiazkaZAutografem) {
            throw new KsiazkaMaAutografException("Książka może mieć tylko jeden autograf!");
        }

        this.autograf = autograf;
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
        return udekorowanaKsiazka.toString() + " " + this.autograf + " |";
    }
}
