package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BomberMan {

    static class Grid {
        static int columns;
        static int rows;
        static List<Cell> cells = new ArrayList<>();

        public Grid(String[] grid){
            rows = grid.length;
            columns = grid[0].length();
            for(String row : grid) {
                for (char cell : row.toCharArray()) {
                    cells.add(Cell.newCell(cell));
                }
            }
        }

        void print(){
            cells.stream().forEach(System.out::print);
        }

        String[] getGridArray(){
            String temp = "";
            String[] gridArray = new String[rows];
            for (Cell cell : cells) {
                temp.concat(cell.getChar());
            }
            return temp.split("/w{7}");
        }

    }

    static abstract class Cell {
        abstract void countDown();
        static public Cell newCell(char type){
            return type == 'O' ? new Bomb() : new EmptyCell();
        }
        abstract String getChar();
    }

    static class EmptyCell extends Cell{
        void countDown(){}

        @Override
        String getChar() {
            return ".";
        }

        ;
        public String toString(){ return ".";}
    }


    static class Bomb extends Cell{
        int timer = 3;
        public void countDown(){
            timer--;
        }

        @Override
        String getChar() {
            return "O";
        }
    }

    static String[] bomberMan(int n, String[] grid) {

        Bomb bomb = new Bomb();
        Grid map = new Grid(grid);
        for (String row : map.getGridArray()) {
            System.out.println(row);
        }

        return grid;
    }

    public static void test() {
        String map = ".......,...O...,....O..,.......,OO.....,OO.....";
        bomberMan(6, map.split(","));
    }

}

