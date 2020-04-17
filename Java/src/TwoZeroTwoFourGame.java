/*
* 2024 Game
* Create game by java language
* Object : Sum numbers on the table util 64.
* Method of the game : Enter the direction for ship numbers on table
* Sample Input                          Sample Output
* Command : r (RIGHT)                   Ship all index to right side and add 2 or 4 in empty index by random.
* |-----|-----|-----|                   |-----|-----|-----|
* |  2  |     |     |                   |     |     |  2  |
* |-----|-----|-----|                   |-----|-----|-----|
* |     |     |     |                   |     |     |     |
* |-----|-----|-----|                   |-----|-----|-----|
* |     |     |     |                   |  4  |     |     |
* |-----|-----|-----|                   |-----|-----|-----|
* |  2  |     |     |                   |     |     |  2  |
* |-----|-----|-----|                   |-----|-----|-----|
* */
import java.util.*;

public class TwoZeroTwoFourGame {

    // Show number in Table
    public static void showTable(ArrayList<Integer> numberList) {
        String[] space1 = {"|  ","  ",};
        String[] space2 = {"|  "," "};
        String[] space3 = {"| "," "};
        System.out.println("|-----|-----|-----|");
        for (int i = 0;i<numberList.size();i++) {

            if (String.valueOf(numberList.get(i)).length() == 1) {
                if (numberList.get(i) == 0) {
                    System.out.print(space1[0]+" "+space1[1]);
                } else {
                    System.out.print(space1[0]+numberList.get(i)+space1[1]);
                }
            } else if(String.valueOf(numberList.get(i)).length() == 2) {
                System.out.print(space2[0]+numberList.get(i)+space2[1]);
            } else if(String.valueOf(numberList.get(i)).length() == 3) {
                System.out.print(space3[0]+numberList.get(i)+space3[1]);
            }

            if ((i+1)%3 == 0)
                System.out.println("|\n|-----|-----|-----|");
        }
    }
    // Create list of number
    public static ArrayList<Integer> initializeBoard() {
        Random random = new Random();
        ArrayList<Integer> newBoard = new ArrayList<>();
        ArrayList<Integer> exclude = new ArrayList<>();
        int[] startNumber = {2,4};
        for(int i = 0;i<12;i++) {
            newBoard.add(0);
        }

        do {
            int current = random.nextInt(newBoard.size());
//            System.out.println("Random : "+newBoard.get(current));
            if (!exclude.contains(current))
                exclude.add(current);
        } while (exclude.size() != 2);

//        System.out.println("All : "+newBoard.toString());
//        System.out.println("Exclude : "+exclude.toString());

        for (int a: exclude) {
            newBoard.set(a,startNumber[random.nextInt(startNumber.length)]);
        }

//        System.out.println("Before Return : "+newBoard.toString());

        return newBoard;
    }
    // Check Existing number in the table
    public static ArrayList<Integer> checkExist(ArrayList<Integer> numberList) {
        ArrayList<Integer> existing = new ArrayList<>();

        for(int i=0;i<numberList.size();i++) {
            if (numberList.get(i) != 0) {
                existing.add(i);
            }
        }

        return existing;
    }
    // Check empty space on the table
    public static boolean checkEmptySpace(ArrayList<Integer> numberList) {

        if (numberList.contains(0)) {
            return true;
        }

        return false;
    }
    // Add new number to table
    public static ArrayList<Integer> randomNewElement(ArrayList<Integer> numberList) {

        Random r = new Random();
        int[] startNumber = {2,4};

        ArrayList<Integer> exclude = new ArrayList<>();

        for (int i = 0;i<numberList.size();i++) {
            if (numberList.get(i) == 0) {
                exclude.add(i);
            }
        }

        numberList.set(exclude.get(r.nextInt(exclude.size())),startNumber[r.nextInt(startNumber.length)]);

        return numberList;
    }
    // Ship number following input direction
    public static ArrayList<Integer> calculateTable(ArrayList<Integer> numberList, String command) {

        ArrayList<Integer> existing = checkExist(numberList);

        int alreadyPlus = 0;
        ArrayList<Integer> checkColumn = new ArrayList();
        ArrayList<Integer> checkRow = new ArrayList();

        switch (command) {
            case "u" :
                System.out.println("Up");
                for(int a:existing) {
                    alreadyPlus = 0;
                    while (a>2) {
                        if (numberList.get(a-3) == 0) {
                            numberList.set(a-3,numberList.get(a-3)+numberList.get(a));
                            numberList.set(a,0);
                        } else if (numberList.get(a) == numberList.get(a-3) && alreadyPlus == 0 && !checkColumn.contains((a+1)%3)) {
                            checkColumn.add((a+1)%3);
                            alreadyPlus = 1;
                            numberList.set(a-3,numberList.get(a-3)+numberList.get(a));
                            numberList.set(a,0);
                        }
                        a -= 3;
                    }
                }
                break;
            case "d" :
                System.out.println("Down");
                existing.sort(Comparator.reverseOrder());
                for(int a:existing) {
                    alreadyPlus = 0;
                    while (a<9) {
                        if (numberList.get(a+3) == 0) {
                            numberList.set(a+3,numberList.get(a+3)+numberList.get(a));
                            numberList.set(a,0);
                        } else if (numberList.get(a) == numberList.get(a+3) && alreadyPlus == 0 && !checkColumn.contains((a+1)%3)) {
                            checkColumn.add((a+1)%3);
                            alreadyPlus = 1;
                            numberList.set(a+3,numberList.get(a+3)+numberList.get(a));
                            numberList.set(a,0);
                        }
                        a += 3;
                    }
                }
                break;
            case "r" :
                System.out.println("Right");
                existing.sort(Comparator.reverseOrder());
                for(int a: existing) {
                    alreadyPlus = 0;
                    while ((a+1)%3 != 0) {
                        if (numberList.get(a+1) == 0) {
                            numberList.set(a+1,numberList.get(a+1)+numberList.get(a));
                            numberList.set(a,0);
                        } else if (numberList.get(a) == numberList.get(a+1) && alreadyPlus ==0 && !checkRow.contains(a/3)) {
                            checkRow.add(a/3);
                            alreadyPlus = 1;
                            numberList.set(a+1,numberList.get(a+1)+numberList.get(a));
                            numberList.set(a,0);
                        }
                        a++;
                    }
                }
                break;
            case "l" :
                System.out.println("Left");
                for(int a: existing) {
                    alreadyPlus = 0;
                    while ((a+1)%3 != 1) {
                        if (numberList.get(a-1) == 0) {
                            numberList.set(a-1,numberList.get(a-1)+numberList.get(a));
                            numberList.set(a,0);
                        } else if (numberList.get(a) == numberList.get(a-1) && alreadyPlus == 0 && !checkRow.contains(a/3)) {
                            checkRow.add(a/3);
                            alreadyPlus = 1;
                            numberList.set(a-1,numberList.get(a-1)+numberList.get(a));
                            numberList.set(a,0);
                        }
                        a--;
                    }
                }
                break;
            default:
                System.out.println("Command is invalid");
                break;
        }

        return numberList;
    }
    // Main function for receive input direction
    public static void Game() {

        List<String> command = Arrays.asList("U","D","L","R");
        Scanner s = new Scanner(System.in);
        int gameState = 0;
        String currentCommand;

        ArrayList<Integer> numberList = initializeBoard();
        String checker;
//        System.out.println(numberList.size());
        showTable(numberList);

        do {
            System.out.print("Enter Command : ");
            currentCommand = s.nextLine();
            if (command.contains(currentCommand.toUpperCase())) {
                checker = numberList.toString();
//                numberList = calculateTable(numberList,currentCommand.toLowerCase());
                numberList = calculateTable(numberList,currentCommand.toLowerCase());
//                System.out.println("Checker : "+checker.toString());
//                System.out.println("Real : "+numberList.toString());
                if (checkEmptySpace(numberList) && !numberList.toString().equals(checker)) {
                    if (numberList.contains(64)) {
                        showTable(numberList);
                        System.out.println("You Win!!");
                        return;
                    }
                    numberList = randomNewElement(numberList);
                }
                else if (!checkEmptySpace(numberList)) {
                    showTable(numberList);
                    System.out.println("Game Over!!!");
                    return;
                }
            }

            showTable(numberList);
        } while (gameState == 0);
        showTable(numberList);
    }

    public static void main(String args[]) {
        System.out.println("Game Start");
        Game();
    }
}
