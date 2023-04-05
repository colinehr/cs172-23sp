public class Hanoi {

    public static void move1(char source, char destination, char helper) {
        StdOut.printf("Move from peg %c to peg %c\n", source, destination);
    }

    public static void move2(char source, char destination, char helper) {
        move1(source, helper, destination);
        move1(source, destination, helper);
        move1(helper, destination, source);
    }

    public static void move3(char source, char destination, char helper) {
        // move three disks using move2 & move1
        move2(source, helper, destination);
        move1(source, destination, helper);
        move2(helper, destination, source);
    }

    public static void move(int n, char source, char destination, char helper) {
        // notice this function only depends on itself, not move1, move2, etc.
        if (n == 1) {
            StdOut.printf("Move from peg %c to peg %c\n", source, destination);
            return;
        }
        // move n disks using move
        move(n - 1, source, helper, destination);
        move(1, source, destination, helper);
        move(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        move(3,'A', 'B', 'C');
    }

}
