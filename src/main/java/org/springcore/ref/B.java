package org.springcore.ref;

import java.util.Map;

public class B {
    private int y;
    private Map<String,Integer> m;

    public B() {
    }

    public int getY() {
        return y;
    }

    public Map<String, Integer> getM() {
        return m;
    }

    public void setM(Map<String, Integer> m) {
        this.m = m;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                ", m=" + m +
                '}';
    }
}
