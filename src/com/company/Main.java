package com.company;

public class Main {

    public static void main(String[] args) {
        Librarian Luda = new Librarian("Luda", "Kekovo 6");
        Card myCard = Luda.giveCard("Serg1k24");
        System.out.println(myCard.toString());
    }

}
