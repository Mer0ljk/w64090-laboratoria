package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wiek: " + wiek());
        System.out.println("Imie: " + imie());

        Random rand = new Random();

        Scanner AB = new Scanner(System.in);
        System.out.println("Podaj poczatek i koniec przedzialu: ");

        int pocz = AB.nextInt();
        int kon = AB.nextInt();

        int a = rand.nextInt(kon - pocz + 1)+pocz;
        int b = rand.nextInt(kon - pocz + 1)+pocz;

        kalkulator(a,b);

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita a program sprawdzi czy jest parzysta: ");
        int c = in.nextInt();

        System.out.println(parzysta(c));

        System.out.println("Podaj liczbe calkowita a program sprawdzi jej podzielnosc przez 3 i 5: ");
        int d = in.nextInt();

        System.out.println(trzypiec(d));

        System.out.println("Podaj liczbe calkowita a program poda jej szescian: ");
        double e = in.nextDouble();

        System.out.println(szescian(e));

        System.out.println("Podaj liczbe calkowita a program wypisze jej pierwiastek: ");
        double f = in.nextDouble();

        System.out.println(pierw(f));

        System.out.println("Podaj poczatek i koniec przedzialu: ");

        int poczT = AB.nextInt();
        int konT = AB.nextInt();

        int Ta = rand.nextInt(konT - poczT + 1)+poczT;
        int Tb = rand.nextInt(konT - poczT + 1)+poczT;
        int Tc = rand.nextInt(konT - poczT + 1)+poczT;

        System.out.println(trojkat(Ta, Tb, Tc));

    }
    // zad 1
    public static int wiek()
    {
        return 20;
    }
    // zad 2
    public static String imie()
    {
        return "Szymon";
    }
    // zad 3
    public static void kalkulator(int a, int b)
    {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
        if(b!=0)
        {
            System.out.println("Iloraz: " + (a / b));
        }
        else System.out.println("Nie mozna dzielic przez 0");
    }
    // zad 4
    public static boolean parzysta(int c)
    {
        return c % 2 == 0;
    }
    // zad 5
    public static boolean trzypiec(int d)
    {
        return d % 3 == 0 && d % 5 == 0;
    }
    // zad 6
    public static double szescian(double e)
    {
        return Math.pow(e,3);
    }
    // zad 7
    public static double pierw(double f)
    {
        return Math.sqrt(f);
    }
    // zad 8
    public static boolean trojkat(int Ta, int Tb, int Tc)
    {
        if( Ta <= 0 || Tb <= 0 || Tc <= 0)
        {
            return false;
        }
        else
        {
            return Ta + Tb >= Tc && Tb + Tc > Ta && Ta + Tc > Tb;
        }

    }

}
