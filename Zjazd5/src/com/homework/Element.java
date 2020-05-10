package com.homework;

/*
    
    Author: Karol Kuchnio   
 */public class Element {

    private String name;
    private String symbolName;
    private int atomicNumber;

    public Element(String name, String symbolName, int atomicNumber) {
        this.name = name;
        this.symbolName = symbolName;
        this.atomicNumber = atomicNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(symbolName);
        sb.append(":(").append(name.toLowerCase());
        sb.append("):").append(name);
        sb.append(" with atomic number ").append(atomicNumber);
        sb.append('.');
        return sb.toString();
    }
}
