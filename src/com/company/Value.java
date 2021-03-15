package com.company;

public class Value {
    int w, p;

    public Value(int w, int p) {
        this.w = w;
        this.p = p;
    }

    @Override
    public String toString() {
        return "" +
                "{" +
                "w=" + w +
                ", p=" + p +
                '}';
    }
}
