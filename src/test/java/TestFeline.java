import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {


    @Spy
    Feline feline;

    @Test
    public void checkEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void checkFamilyFeline() {
        String actualFamily = feline.getFamily();
        assertEquals("Неверное семейство для кошачьих", "Кошачьи", actualFamily);
    }

    @Test
    public void getKittensWithParam() {
        int kittensCount = 2;
        int actualKittensCount = feline.getKittens(kittensCount);
        assertEquals("Число котят не соответствует ожидаемому",kittensCount, actualKittensCount);
    }

    @Test
    public void getKittensWithoutParam() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }


}
