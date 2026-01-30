package com.democicd1290.testgit;

public class Classe {
    private int id;

    public Classe(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Classe {id=" + id + "}";
    }
}
