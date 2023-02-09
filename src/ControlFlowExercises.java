public class ControlFlowExercises {
    public static void main (String[] args){

        //#1
        int count = 0;

        do {
            System.out.println(count);
            count += 2;
        } while (count <= 100);

        //#2
        int countMinus5 = 100;

        do {
            System.out.println(countMinus5);
            countMinus5 -= 5;
        } while (countMinus5 >= -10);

        //#3
        long num = 2;
        System.out.println(num);
        do {
            long square = num * num;
            if (square == 2 || square == 4 || square == 16 || square == 256 || square == 65536) {
                System.out.println(square);
            }
            num++;
        } while (num * num < 1000000);

    }
}
