package Interfaces;

import java.util.ArrayList;

public class Player implements Isavable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(int hitPoints, int strength, String name) {
        this.hitPoints = hitPoints;
        this.name  = name;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String > list = new ArrayList<String>();
        list.add(this.name);
        list.add(this.weapon);
        list.add(String.valueOf(this.hitPoints));
        list.add(String.valueOf(this.strength));
        return list;
    }

    @Override
    public String toString() {
        return "Player : name = "+this.name+" ; weapon = "+this.weapon;
    }

    @Override
    public void read(ArrayList<String> list) {
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //    public
}
