package iFactory;
import Cacu.*;
/**
 * Created by hjing on 1/11/17.
 */
public class IFactoryMutiple implements IFactory {
    public Caculator createCaculator()
    {
        return new MutipleCaculator();
    }
}
