package src;


import java.util.Random;

public class Drawer {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(args.length);
        String random = args[randomNumber];
        System.out.println(random);
    }
}
