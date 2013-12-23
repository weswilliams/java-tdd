package org.javatdd;

import static org.mockito.Mockito.*;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class MoneyTest {
 
 @BeforeClass
 public void setUp() {
 }
 
 @Test()
 public void shouldHaveEnvironmentWorking() {
     List mockList = mock(List.class);
     when(mockList.get(0)).thenReturn("data");
     Assert.assertEquals(mockList.get(0), "data", "we should have stubbed get(0)");
 }
 
}

