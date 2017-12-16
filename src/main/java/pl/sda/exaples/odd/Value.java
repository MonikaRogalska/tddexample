package pl.sda.exaples.odd;
import com.google.common.base.Preconditions;

public class Value {

    public boolean idOdd(Integer number){
        Precondition.check(number!=null, "number can not be null");

        return number % 2 == 1;
    }
}
