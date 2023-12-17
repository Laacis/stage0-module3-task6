package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result  = (int) numberToBeRounded;

        if(numberToBeRounded % 1 >= 0.5){
            result++;
        }

        System.out.println(result);
    }
}
