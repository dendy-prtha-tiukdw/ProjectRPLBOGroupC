package org.groupa.week7;

public class Main {

    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.start();
//
//        Convertible myCOnConvertible = new Convertible();
//        myCOnConvertible.start();

        Weapon weapon = new Weapon();
        weapon.damage = 50;

//        Enemy enemy = new Enemy();
//        enemy.current_weapon = weapon;
//        enemy.strength = 10;
//        enemy.health = 30;
//        enemy.name = "darto_helm";
//        enemy.position_x = 100;
//        enemy.position_y = 10;

        Player player = new Player();
        player.health = 100;
        player.strength = 10;
        player.name = "P1";
        player.current_weapon = weapon;
        player.position_x = 50;
        player.position_y = 10;

//        enemy.attack(player);
//
//        player.attack(enemy);

    }
}
