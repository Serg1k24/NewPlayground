package com.company;

class Librarian extends Human implements CardGivable {
    private String address;
    private int lastId;

    Librarian(String name, String address) {
        super(name, 150, "female");

        this.address = address;
        lastId = 0;
    }

    @Override
    public Card giveCard(String name) {
        lastId++;
        return new Card(name, address, lastId);
    }
}
