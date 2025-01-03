import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\nTask 2");
        dog +=4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\nTask 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("\nTask 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println("\nTask 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println("\nTask 6");
        var firstBoxerWeight = 78.2;
        System.out.println("firstBoxerWeight = " + firstBoxerWeight);
        var secondBoxerWeight = 82.7;
        System.out.println("secondBoxerWeight = " + secondBoxerWeight);
        var summaryBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Масса двух бойцов = " + summaryBoxerWeight);
        var boxerWeightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе двух бойцов = " + boxerWeightDifference);

        System.out.println("\nTask 7");
        var weightRemainder = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления веса двух бойцов = " + weightRemainder);

        System.out.println("\nTask 8");
        var commonAmountOfWork = 640;
        System.out.println("commonAmountOfWork = " + commonAmountOfWork);
        var oneEmployeeWorkHourAmount = 8;
        System.out.println("oneEmployeeWorkHourAmount = " + oneEmployeeWorkHourAmount);
        var employeeAmount = commonAmountOfWork  / oneEmployeeWorkHourAmount;
        System.out.println("Всего работников в компании - " + employeeAmount + " человек");
        var newEmployeeAmount = employeeAmount + 94;
        var newCommonAmountOfWork = newEmployeeAmount * oneEmployeeWorkHourAmount;
        System.out.printf("Если в компании работает %s человек, то всего %s часов работы может быть поделено между сотрудниками» = ", newEmployeeAmount, newCommonAmountOfWork);
        }
}