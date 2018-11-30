package SomePackage;

import java.util.Objects;

class SomeClass {
    public String string;
    public int a=23;
    private double b=15.2;

    public SomeClass(String string, int a, double b) {
        this.string = string;
        this.a = a;
        this.b = b;
    }

    private void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SomeClass)) return false;
        SomeClass someClass = (SomeClass) o;
        return getA() == someClass.getA() &&
                Double.compare(someClass.b, b) == 0 &&
                Objects.equals(getString(), someClass.getString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getString(), getA(), b);
    }

    private String getString() {
        return string;
    }
}
