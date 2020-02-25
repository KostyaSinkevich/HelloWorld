package com.company;

public class Object1 extends Object {
    public Integer ves = 1;

    @Override
    public boolean equals(Object obj) {
        return this.ves == obj;
    }

    public boolean equals(Object obj, Object1 object1) {
        return obj.equals(object1);
    }

    @Override
    public String toString() {
        return "Object1{" +
                "ves=" + ves +
                '}';
    }
}
