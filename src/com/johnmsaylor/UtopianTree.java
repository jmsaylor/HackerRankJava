package com.johnmsaylor;

public class UtopianTree {
    public int height = 1;
    public int cycles = 1;

    public int grow(int cycles) {
        while (this.cycles <= cycles) {
            this.height = this.cycles % 2 == 0 ? height + 1 : height * 2;
            this.cycles++;
        }
        return this.height;
    }

}
