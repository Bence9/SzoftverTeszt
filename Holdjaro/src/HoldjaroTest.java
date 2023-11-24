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
    
    @Test
    public void MoveTest(){
        Assert.assertEquals("N35", Holdjaro.Move('f'));
    }
    
    @Test
    public void BumpTest(){
        Assert.assertEquals("N45", Holdjaro.Move('b'));
    }
    
}