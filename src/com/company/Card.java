package com.company;

public class Card {
    private String name;
    private String libraryAddress;
    private int id;


    Card(String name, String libraryAddress, int id) {
        this.name = name;
        this.libraryAddress = libraryAddress;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                "\nlibraryAddress = '" + libraryAddress + '\'' +
                "\nid = " + id + '\n';
    }
}
