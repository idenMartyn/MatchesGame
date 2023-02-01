import java.util.Scanner;

public class Main {
    static MessageOutput messageOutput = new MessageOutput();
    static ComputerLogic computerLogic = new ComputerLogic();
    public static void main(String[] args) {
        Main main = new Main();
        //1шаг
        main.playStepOne();
        //2, 3, 4 шаг
        main.playStepTwoThreeFour();
        main.playStepTwoThreeFour();
        main.playStepTwoThreeFour();
        //5 шаг
        main.playStepFive();

    }

    public void playStepOne(){
        //Приветствие
        System.out.println(messageOutput.Greetings);
        //"На столе осталось Х спичек"
        System.out.println(messageOutput.getNumberOfMatchesLeft());
        //Метод считает количество спичек которое выбрал компьютер
        computerLogic.calculateCountMatchesSelectedComputer();
        //"- Количество выбранных компьютером спичек = Х."
        System.out.println(messageOutput.getCountMatchesSelectedComputer());
        //Метод считает сколько спичек осталось
        computerLogic.calculateCountMatches();
        //"На столе осталось Х спичек"
        System.out.println(messageOutput.getNumberOfMatchesLeft());
        //" - Ход игрока. Введите количество спичек"
        System.out.print(messageOutput.playerStep);
    }


    public void playStepTwoThreeFour(){
        //Игрок вводит количество спичек
        computerLogic.makeMove();
        //"На столе осталось Х спичек"
        System.out.println(messageOutput.getNumberOfMatchesLeft());
        //Метод считает количество спичек которое выбрал компьютер
        computerLogic.calculateCountMatchesSelectedComputer();
        //"- Количество выбранных компьютером спичек = Х."
        System.out.println(messageOutput.getCountMatchesSelectedComputer());
        //Метод считает сколько спичек осталось
        computerLogic.calculateCountMatches();
        //"На столе осталось Х спичек"
        System.out.println(messageOutput.getNumberOfMatchesLeft());
        //" - Ход игрока. Введите количество спичек"
        System.out.print(messageOutput.playerStep);
    }

    public void playStepFive(){
        //Игрок вводит количество спичек
        computerLogic.makeMove();
        //"На столе осталось Х спичек"
        System.out.println(messageOutput.getNumberOfMatchesLeft());
        //Метод считает количество спичек которое выбрал компьютер
        computerLogic.calculateCountMatchesSelectedComputer();
        //"- Количество выбранных компьютером спичек = Х."
        System.out.println(messageOutput.getCountMatchesSelectedComputer());
        //Метод считает сколько спичек осталось
        computerLogic.calculateCountMatches();
        //"На столе осталось Х спичек"
        System.out.println(messageOutput.getNumberOfMatchesLeft());
        System.out.print(messageOutput.endGame);
    }


}

