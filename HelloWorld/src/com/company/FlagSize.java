package com.company;

public enum FlagSize{
    SMALL(6),MEDIUM(12),LARGE(18);

    FlagSize(int id) {
        this.id = id;
    }
    private final int id;
    public int getValue() { return id; }
}
