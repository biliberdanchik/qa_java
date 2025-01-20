import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionAlex {

    @Mock
    Feline feline;

    @Test
    public void checkGetFriends() {
        LionAlex lion = new LionAlex(feline);
        List<String> actual = lion.getFriends();
        assertEquals("Список друзей неверный", List.of("зебра Марти", "бегемотиха Глории", "жираф Мелман"), actual);
    }

    @Test
    public void checkGetPlaceOfLiving() {
        LionAlex lion = new LionAlex(feline);
        String actual = lion.getPlaceOfLiving();
        assertEquals("Место жительство неверное", "Нью-Йоркский зоопарк", actual);
    }

    @Test
    public void checkGetKittensAlex() {
        LionAlex lionAlex = new LionAlex(feline);
        lionAlex.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(0);
    }
}
