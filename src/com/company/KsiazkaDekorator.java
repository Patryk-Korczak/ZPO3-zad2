package com.company;

public abstract class KsiazkaDekorator implements Publikacja {
    protected Publikacja udekorowanaKsiazka;

    public KsiazkaDekorator(Publikacja udekorowanaKsiazka) {
        super();
        this.udekorowanaKsiazka = udekorowanaKsiazka;
    }
}
