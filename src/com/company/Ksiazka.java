package com.company;

public class Ksiazka implements Publikacja {
    int strony;
    String autor;
    String tytul;

    public Ksiazka() {
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTytul() {
        return this.tytul;
    }

    @Override
    public int getStrony() {
        return this.strony;
    }

    @Override
    public String toString() {
        return "| " + this.getAutor() + " | " + this.getTytul() + " | " + this.getStrony() +" |";
    }

    public void setStrony(int strony) {
        this.strony = strony;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    Ksiazka(String autor, String tytul, int strony) {
        this.strony = strony;
        this.tytul = tytul;
        this.autor = autor;
    }


}
