package javaStringLevel3;

import java.util.Scanner;
import java.util.Arrays;

public class DeckOfCards {
    public static String[] initializeDeck(){
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[suits.length*ranks.length];
        int k=0;
        for(String s:suits) for(String r:ranks) deck[k++]=r+" of "+s;
        return deck;
    }

    public static void shuffleDeck(String[] deck){
        int n=deck.length;
        for(int i=0;i<n;i++){
            int r=i+(int)(Math.random()*(n-i));
            String tmp=deck[i];
            deck[i]=deck[r];
            deck[r]=tmp;
        }
    }

    public static String[][] distribute(String[] deck,int n,int x){
        if(n*x>deck.length) return null;
        String[][] players=new String[x][n];
        for(int i=0;i<n;i++) for(int j=0;j<x;j++) players[j][i]=deck[i*x+j];
        return players;
    }

    public static void printPlayers(String[][] players){
        for(int i=0;i<players.length;i++) System.out.println("Player "+(i+1)+": "+Arrays.toString(players[i]));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] deck=initializeDeck();
        shuffleDeck(deck);
        System.out.println("Enter number of cards per player and number of players:");
        int n=sc.nextInt();
        int x=sc.nextInt();
        String[][] players=distribute(deck,n,x);
        if(players!=null) printPlayers(players);
        else System.out.println("Not enough cards to distribute.");
        sc.close();
    }
}
