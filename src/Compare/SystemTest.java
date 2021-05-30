package Compare;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * system
 * math
 * biginteger bigdecimal(对精度要求高，不能用double和float)
 */
public class SystemTest {
    @Test
    public void test(){
        String ja = System.getProperty("java.version");
        System.out.println(ja);
    }

    @Test
    public void test1(){
        BigInteger b = new BigInteger("46768465465111111113132468749646514");
        System.out.println(b);

        BigDecimal s = new BigDecimal("45676454654.77746431374684");
        System.out.println(s);
    }


}
