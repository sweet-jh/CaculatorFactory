package iFactory;
import Cacu.*;
/**
 * Created by hjing on 1/11/17.
 */
public class IFactoryMinus implements IFactory {
    public Caculator createCaculator()
    {
        return new MinusCaculator();
    }
}
