/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javathred;

/**
 *
 * @author rashm
 */

public class Javathred extends Thread {

    /**
     *
     */
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }

    public static void main(String[] args) {
        Javathred t1 = new Javathred();
        t1.start();
    }
}
