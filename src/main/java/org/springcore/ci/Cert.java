package org.springcore.ci;

public class Cert {
    String name;

    public Cert(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
