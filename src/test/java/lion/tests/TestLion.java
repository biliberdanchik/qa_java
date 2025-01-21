package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void checkThrowsExceptionLionConstructor() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(feline, "Небинарная личность"));
        assertEquals("Тест исключения не соответствует ожидаемому","Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
