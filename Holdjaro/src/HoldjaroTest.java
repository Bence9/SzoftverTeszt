import org.junit.Assert;
import org.junit.Test;

public class HoldjaroTest {

    @Test
    public void TurnRightTest(){
        Assert.assertEquals('E', Holdjaro.Turn('r'));
    }
    
    @Test
    public void TurnLeftTest(){
        Assert.assertEquals('N', Holdjaro.Turn('l'));
    }
    
}