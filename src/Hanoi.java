public class Hanoi {

    public static void move1(char source, char destination, char helper) {
        StdOut.printf("Move from peg %c to peg %c\n", source, destination);
    }

    public static void move2(char source, char destination, char helper) {
        // move two disks using move1
    }

    public static void move3(char source, char destination, char helper) {
        // move three disks using move2
    }

    public static void move(int n, char source, char destination, char helper) {
        // move n disks using move and move1 (or just printing)
    }

    public static void main(String[] args) {
        /*
        Should output the following:
            Move from peg A to peg C
            Move from peg A to peg B
            Move from peg C to peg B
         */
        move2('A', 'B', 'C');
    }

}
