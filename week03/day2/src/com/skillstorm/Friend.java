package com.skillstorm;

public class Friend {

    String name;
    Friend besty;

    public Friend() {
        this.name = "unknown";
        this.besty = null;
    }

    public Friend(String name) {
        this.name = name;
        this.besty = new Friend();
    }

    public Friend(String name, Friend besty) {
        this.name = name;
        this.besty = besty;
    }

    public static void main(String[] args) {
        Friend friend1 = new Friend("sam");
    }

}
