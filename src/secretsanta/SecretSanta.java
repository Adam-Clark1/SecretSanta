package secretsanta;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SecretSanta {

    static int randpick1;
    static int randpick2;
    static String enter = ("no");

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String[] peeps = {"Jaime Kirby", "Jamie Forbes-Whitear", "Zoey", "Anne Marie", "Emma", "Calypso", "Jake", "Adam"};
        String[] pick = {"*", "*", "*", "*", "*", "*", "*", "*"};
        ArrayList<String> names = new ArrayList<>();

        names.add("Jaime Kirby");
        names.add("Jamie Forbes-Whitear");
        names.add("Zoey");
        names.add("Anne Marie");
        names.add("Emma");
        names.add("Calypso");
        names.add("Jake");
        names.add("Adam");

        for (int i = 0; i < peeps.length; i++) {

            boolean check = true;

            while (check = true) {

                randpick1 = rand.nextInt(peeps.length);
                randpick2 = rand.nextInt(peeps.length);
                if (names.get(randpick1) != peeps[randpick2]) {
                    if (pick[randpick2].equals("*")) {
                        for (int j = 0; j < peeps.length; j++) {
                            if (names.get(randpick1) != pick[j]) {
                                check = false;
                                enter = ("yes");
                            } else {
                                check = true;
                                j = peeps.length;
                                enter = ("no");
                            }
                        }
                        break;
                    }
                }
            }
            if (enter.equals("yes")) {
                pick[randpick2] = names.get(randpick1);
            } else {
                i--;
            }

        }

        for (int i = 0;
                i < peeps.length;
                i++) {
            System.out.println(peeps[i] + " got " + pick[i]);
        }

    }

}
