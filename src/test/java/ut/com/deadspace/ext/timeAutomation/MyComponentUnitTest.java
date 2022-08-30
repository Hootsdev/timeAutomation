package ut.com.deadspace.ext.timeAutomation;

import org.junit.Test;
import com.deadspace.ext.timeAutomation.api.MyPluginComponent;
import com.deadspace.ext.timeAutomation.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}