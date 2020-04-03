package ru.otus;

import com.google.common.math.IntMath;

import java.util.Random;

public class HelloOtus {
    public static void main(String[] args) {
        new HelloOtus().getGreeting();
    }

    public void getGreeting() {
        System.out.println("Hi, lets check some random ints!");
        new Random().ints(10, 0, 1000).forEach(
                i -> {
                    System.out.printf("We get %d and it is %s\r\n", i, IntMath.isPrime(i) ? "prime" : "not prime");
                }
        );
    }
}
