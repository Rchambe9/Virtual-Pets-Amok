package pets_amok;

import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] arg) {

        pets_amok.VirtualPetShelter rcshelter = new pets_amok.VirtualPetShelter();
        Scanner input = new Scanner(System.in);

        OrganicPets silas = new OrganicDog("Silas", "German Shepard");
        rcshelter.intake(silas);
        OrganicPets sophia = new OrganicCat("Sophia", "Swiss Feline");
        rcshelter.intake(sophia);
        RoboticPets saul = new RoboticDog("Saul", "American Bulldog") {
        };
        rcshelter.intake(saul);

        RoboticPets stella = new RoboticCat("Stella", "Persian Cat");
        rcshelter.intake(stella);

        boolean quit = false;

        while (true) {
            if (rcshelter.getLitterBox() >= 100) {
                System.out.println("Sophia's litterbox is full and it's making all organic animals sick.");
                for (VirtualPet pet : rcshelter.retrieveAllPets()) {
                    if (pet instanceof OrganicCat) {
                        ((OrganicCat) pet).decreaseHealth();
                    }
                }
            }
            for (VirtualPet pet : rcshelter.retrieveAllPets()) {
                if (pet instanceof OrganicDog) {

                    if (((OrganicDog) pet).getCageMessiness() >= 100) {
                        System.out.println(pet.getPetName() + ", the organic dog, has been in his cage too long and it needs to be cleaned. " +
                                "We don't want him to get sick.");
                        ((OrganicDog) pet).decreaseHealth();
                    }
                }
            }
            for (VirtualPet pet : rcshelter.retrieveAllPets()) {
                if (pet instanceof RoboticPets) {

                    if (((RoboticPets) pet).getOilLevel() <= 10) {
                        System.out.println("The robotic pet " + pet.getPetName()
                                + "'s needs oil and it's currently negatively affecting their health.");
                        pet.decreaseHealth();
                    }
                }
            }
            System.out.println("Welcome to the Robyn's Exotic Pet Shop");
            System.out.println("What would you like to do today?");
            System.out.println("This is the current status of our pets: ");
            System.out.println(" Name   | Happiness | Health| Hunger | Thirst | Energy | OilLevel  ");
            System.out.println("________|___________|_______|________|________|________|___________");

            for (VirtualPet currentPet : rcshelter.retrieveAllPets()) {
                System.out.print(currentPet.getPetName() + "\t|" + ((VirtualPet) currentPet).getHappinessLevel() + "\t\t\t|"
                        + ((VirtualPet) currentPet).getHealthLevel() + "\t\t|");
                if (currentPet instanceof OrganicPets) {
                    System.out.print(((OrganicPets) currentPet).getHunger() + "\t\t\t|"
                            + ((OrganicPets) currentPet).getThirst() + "\t\t|N/A\t|");
                } else if (currentPet instanceof RoboticPets) {
                    System.out.print("N/A\t\t|N/A\t|" + ((RoboticPets) currentPet).getOilLevel() + "\t\t|");
                }
                if (currentPet instanceof OrganicDog) {
                    System.out.print("" + ((OrganicDog) currentPet).getCageMessiness() + "\t|");
                } else {
                    System.out.print("N/A\t|");
                }
                System.out.print("");

            }

            System.out.println("The litterbox messiness level (0-100) is: " + rcshelter.getLitterBox());
            System.out.println("The cage dirtiness level (0-100) is: " + rcshelter.getDogCage());
            System.out.println();
            String source = "[1]Feed the organic pets, 2)Give the organic pets water, 3)Play with any pet you choose, 4)Adopt a pet to take home, 5)Admit a pet into the shelter, 6)Clean the dog cages, 7)Clean the cat's litter box, 8)Walk Dogs for exercise, 9)Do light maintenance on the RoboticPets, 10)Quit the program";
            String[] elements = source.split(",");

            System.out.println(elements[1]);
            System.out.println(elements[2]);
            System.out.println(elements[3]);
            System.out.println(elements[4]);
            System.out.println(elements[5]);
            System.out.println(elements[6]);
            System.out.println(elements[7]);
            System.out.println(elements[8]);
            System.out.println(elements[9]);
//            System.out.println(elements[10]);
            System.out.println("What would you like to do first?");

//            while (true) {

                int userInput = input.nextInt();

                if (userInput == 1) {
                    System.out.println("Thank you for your help! You have fed all the organic pets!");
                    rcshelter.feedAllOrganic();
                    System.out.println("Make another selection.");
                    System.out.println();

                } else if (userInput == 2) {
                    System.out.println("Thank you for giving the organic pets water!");
                    rcshelter.waterAllOrganic();
                    System.out.println("What would you like to do next?");
                    input.nextLine();
                    System.out.println();

                } else if (userInput == 3) {
                    System.out.println("Great! The pets love to play. Which one would you like to play with?");
                    rcshelter.retrieveAllPets();
                    System.out.println();
                    String petName = input.nextLine();
                    rcshelter.playWithOne(rcshelter.getPet(petName));
                    System.out.println("Wonderful! You have chosen to play with " + rcshelter.getPet(petName).getPetName() + ". ");
                    System.out.println("What's next?");
                    input.nextLine();
                    System.out.println();

                } else if (userInput == 4) {
                    System.out.println("Adopting a pet is a win-win for everyone. Which pet do you want?");
                    rcshelter.retrieveAllPets();
                    System.out.println("Which pet would you like to adopt");
                    String nameToAdopt = input.nextLine();
                    VirtualPet pet = rcshelter.getPet(nameToAdopt);
                    rcshelter.adoptPet(pet);
                    System.out.println("You adopted " + pet.getPetName() + ". Please take good care of him/her!");
                    System.out.println("Anything else you would like to do today?");
                    input.nextLine();
                    System.out.println();

                } else if (userInput == 5) {
                    System.out.println("We'll be happy to accept your pet. Is it organic or robotic?");
                    String response1 = input.next();
                    if (response1.equalsIgnoreCase("organic")) {
                        System.out.println("Ok. Is your organic pet a cat or a dog?");
                        String response2 = input.next();
                        input.nextLine();
                        if (response2.equalsIgnoreCase("dog")) {
                            System.out.println("Excellent! What is your dog's name?");
                            String name = input.nextLine();
                            System.out.println("What kind of dog is he or she?");
                            String description = input.nextLine();
                            OrganicPets x = new OrganicDog(name, description);
                            rcshelter.intake(x);
                            System.out.println("Thank you! We will do our best to find " + x.getPetName() + " a good home.");
                            System.out.println("Something else you would like to do today?");
                            input.nextLine();
                            System.out.println();

                        } else if (response2.equalsIgnoreCase("cat")) {
                            System.out.println("What is the cat's name?");
                            String name = input.nextLine();
                            System.out.println("What breeed is the cat?");
                            String description = input.nextLine();
                            OrganicPets y = new OrganicCat(name, description);
                            rcshelter.intake(y);
                            System.out.println("Awesome! We will take good care of " + y.getPetName() + ".");
                            System.out.println("What else can you do today?");
                            input.nextLine();
                            System.out.println();


                        } else if (response1.equalsIgnoreCase("robotic")) {
                            System.out.println("We enjoy all things robotic!! Is your robotic pet a cat or a dog?");
                            String response3 = input.next();
                            input.nextLine();

                            if (response3.equalsIgnoreCase("dog")) {
                                System.out.println("What is the dog's name?");
                                String name = input.nextLine();
                                System.out.println("Great! What kind of dog is he or she?");
                                String description = input.nextLine();
                                RoboticPets r = new RoboticDog(name, description);
                                rcshelter.intake(r);
                                System.out.println("We will take good care of " + r.getPetName() + ".");
                                System.out.println("What's next?");
                                input.nextLine();
                                System.out.println();

                            } else if (response3.equalsIgnoreCase("cat")) {
                                System.out.println("Wonderful! What is the cat's name?");
                                String name = input.nextLine();
                                System.out.println("What breed is the cat?");
                                String description = input.nextLine();
                                RoboticPets w = new RoboticCat(name, description);
                                rcshelter.intake(w);
                                System.out.println("Thanks! We'll take good care of " + w.getPetName() + ".");
                                System.out.println("Next...");
                                input.nextLine();
                                System.out.println();

                            } else if (userInput == 6)
                                rcshelter.cleanDogCages();
                            System.out.println("Your help cleaning organic dog cages is so appreciated!");
                            System.out.println("Is there anything else you would like to do?");
                            System.out.println();

                        } else if (userInput == 7)
                            rcshelter.cleanLitterBox();
                        System.out.println("Thank you for cleaning the cat's litter box.  Those can become quite stinky.");
                        System.out.println("What would you like to do next?");
                        input.nextLine();
                        System.out.println();

                    } else if (userInput == 8) {
                        rcshelter.walkDogs();
                        System.out.println("You have walked all the dogs! They are good and tired now.");
                        System.out.println("What else would you like to do?");
                        input.nextLine();
                        System.out.println();


                    }
                    if (userInput == 9) {
                        rcshelter.maintainAllRobo();
                        System.out.println("You have oiled all robotic pets!");
                        System.out.println("What else would you like to do today?");
                        input.nextLine();


                    } else if (userInput == 10) {
                        System.out.println("You have exited the program.");
                        System.out.println("Thank you for visiting Robyn's Exotic Pet Shop");
//                        System.exit(1);

                        rcshelter.tickAllPets();

                    }

                    input.close();
                }

            }
        }
    }
