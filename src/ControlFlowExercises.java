public class ControlFlowExercises {
    public static void main (String[] args){

        // While-loop as a For-loop
        for(int i = 5; i <= 15; i++){
            System.out.print(i + " ");
        }

        //Do-while-loop as a For-loop
        //#1
        for(int count = 0; count <= 100; count +=2){
            System.out.println(count);
        }


        //#2
        for(int countMinus5 = 100; countMinus5 >= -10; countMinus5 -= 5 ){
            System.out.println(countMinus5);
        }


        //#3
        for(long i = 2; i < 1000000; i = i * i){
            System.out.println(i);
        }

    }
}
