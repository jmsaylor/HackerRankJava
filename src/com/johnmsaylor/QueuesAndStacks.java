package com.johnmsaylor;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueuesAndStacks {
    Deque<Character> stack = new ArrayDeque();
    Deque<Character> queue = new ArrayDeque();

    public void pushCharacter(Character character){
        stack.addLast(character);
    }

    public void enqueueCharacter(Character character) {queue.addLast(character);}

    public Character popCharacter() {return stack.removeLast();}

    public Character dequeueCharacter() {return queue.removeFirst();}

}
