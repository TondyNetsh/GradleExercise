import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void PersonTest() {
        Person person = new Person("Rotondwa", 30, 'M', new String[]{"hardarse", "agile", "ssd hard drives"});


        Assert.assertEquals(person.getName(), "Rotondwa");
    }
}