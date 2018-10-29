/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan59.detectiveconan;

/**
 *
 * @author Aldy Senda
 */
public class MainCharacter extends Character{
    private String speciality;
    private String goal;

    public MainCharacter(String speciality, String goal, String name, 
            String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.speciality = speciality;
        this.goal = goal;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGoal() {
        return goal;
    }
    public void displayCharacter() {
        System.out.println("--------------------");
        System.out.println("Nama : " + name);
        System.out.println("--------------------");
        System.out.println("Dari : " + from);
        if(eyeglasses) {
            System.out.println("Kacamata  : Iya");
        } else {
            System.out.println("Kacamata  : Tidak");
        }
        System.out.println("Spesialis : " + speciality);
        System.out.println("Tujuan    : " + goal);
        System.out.println();
    }
}
