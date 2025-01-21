package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionParam {
    private final String sex;
    private final boolean expected;

    public TestLionParam(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkLionConstructor() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(feline, sex);
        assertEquals("Неверный признак наличия гривы", expected, lion.doesHaveMane());
    }
}
