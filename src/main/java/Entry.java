import Cacu.Caculator;
import iFactory.*;

/**
 * Created by hjing on 1/11/17.
 */
public class Entry {
    static public void main(String[] args)
    {
        IFactory iFactory;
        Caculator caculator;

        iFactory = new IFactoryAdd();
        caculator = iFactory.createCaculator();
        caculator.setOperatorA(5.2);
        caculator.setOperatorB(2.2);
        System.out.println(caculator.getResult());


        iFactory = new IFactoryMinus();
        caculator = iFactory.createCaculator();
        caculator.setOperatorA(8);
        caculator.setOperatorB(2);
        System.out.println(caculator.getResult());

    }
}
