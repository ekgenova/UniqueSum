import java.util.Scanner;

public class UniqueSum {

    /*Scanner for user input. Takes three integer values.*/
    private Scanner intScanner = new Scanner(System.in);

    private int getFirst(){
        System.out.println("Input your first number.");
        int firstInt = intScanner.nextInt();
        return firstInt;
    }

    private int getSecond(){
        System.out.println("Input your second number.");
        int secondInt = intScanner.nextInt();
        return secondInt;
    }

    private int getThird(){
        System.out.println("Input your third number.");
        int thirdInt = intScanner.nextInt();
        return thirdInt;
    }

    int uniqueSum(int first, int second, int third){
        if (first != second && first != third && second != third){
            return (first+second+third);
        } else if (first != second && first != third && second == third){
            return first;
        } else if (first != second && first == third && second != third){
            return second;
        } else if (first == second && first != third && second != third){
            return third;
        } else {
            return 0;
        }
    }

    void calculateUniqueSum(){
        int total = uniqueSum(getFirst(),getSecond(),getThird());
        System.out.println(total);
    }

}
