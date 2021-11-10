package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(320);
        boss.setHealth(70);
        boss.setDefence("каменая ");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefence());
    }
}
