package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            String command = scanner.nextLine();

            switch (command) {
                case "new":
                    System.out.println("---NEW RELEASES---");
                    System.out.println("""
                            Mountains [Sia, Diplo, Labrinth]
                            Runaway [Lil Peep]
                            The Greatest Show [Panic! At The Disco]
                            All Out Life [Slipknot]""");
                    break;
                case "featured":
                    System.out.println("---FEATURED---");
                    System.out.println("""
                            Mellow Morning
                            Wake Up and Smell the Coffee
                            Monday Motivation
                            Songs to Sing in the Shower""");
                    break;
                case "categories":
                    System.out.println("---CATEGORIES---");
                    System.out.println("""
                            Top Lists
                            Pop
                            Mood
                            Latin""");
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    run = false;
                    break;
                default:
                    if (command.matches("playlists .*")) {
                        String playlist = command.replaceAll("playlists ", "");
                        System.out.println("---" + playlist.toUpperCase() + " PLAYLISTS---");
                        System.out.println("""
                                Walk Like A Badass
                                Rage Beats
                                Arab Mood Booster
                                Sunday Stroll""");
                    } else {
                        System.out.println("command doesn't exists");
                    }
            }
        }

        scanner.close();
    }
}
