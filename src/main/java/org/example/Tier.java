package org.example;

public record Tier(int id, String name, String species, int alter, Besitzer besitzer, Art art) {
    public Tier {
    }

    public Tier withBesitzer(Besitzer besitzer) {
        return new Tier(id, name, species, alter, besitzer, this.art);
    }

    public Tier withArt(Art art) {
        return new Tier(id, name, species, alter, this.besitzer, art);
    }
}


