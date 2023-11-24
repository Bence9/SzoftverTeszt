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
    public void MoveForwardTest(){
        Assert.assertEquals("N35", Holdjaro.Move('f'));
    }
    
    @Test
    public void MoveBackwardTest(){
        Assert.assertEquals("N45", Holdjaro.Move('b'));
    }
    
    @Test
    public void CollisionDetectionTest(){
        Assert.assertEquals("N45", Holdjaro.Move('b'));
    }
    
}