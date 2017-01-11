package Cacu;

/**
 * Created by hjing on 1/11/17.
 */
public class MinusCaculator extends Caculator {
    @Override
    public double getResult()
    {
        return this.getOperatorA() - this.getOperatorB();
    }
}
