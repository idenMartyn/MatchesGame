public class MessageOutput {
    String Greetings = "Добро пожаловать в игру!";
    String playerStep = " - Ход игрока. Введите количество спичек: ";
    String endGame = "Для игрока осталась последняя спичка. игрок проиграл!";
    String getCountMatchesSelectedComputer() {
        return " - Количество выбранных компьютером спичек = " + ComputerLogic.countMatchesSelectedComputer + ".";
    }
    String getNumberOfMatchesLeft() {
        return "На столе осталось " + ComputerLogic.countMatches +  " спичек.";
    }
}
