import java.util.Scanner;

public class ComputerLogic {
    static byte countMatches = 20;
    static byte countMatchesSelectedComputer;
    Scanner scanner = new Scanner(System.in);

    void calculateCountMatchesSelectedComputer(){
        if(countMatches == 20 || countMatches == 16 || countMatches == 12 || countMatches == 8 || countMatches == 4){
            countMatchesSelectedComputer = 3;
        } else if(countMatches == 15 || countMatches == 11 || countMatches == 7 || countMatches == 3){
            countMatchesSelectedComputer = 2;
        } else if(countMatches == 14 || countMatches == 10 || countMatches == 6 || countMatches == 2){
            countMatchesSelectedComputer = 1;
        }
    }
    void calculateCountMatches(){
        countMatches -= countMatchesSelectedComputer;
    }

    void makeMove(){
        int count = scanner.nextInt();
        while (count != 1 && count != 2 && count != 3){
            System.out.println("Вводить можно только число равное 1, 2 или 3");
            count = scanner.nextInt();
        }
        countMatches -= count;
    }
}















