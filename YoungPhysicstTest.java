package LabAss1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class YoungPhysicstTest {
    int a1[][]={{3,-1,7},{-5,2,-4},{2,-1,-3}};
    int a2[][]={{4,1,7},{-2,4,-1},{1,-5,-3}};
    int a3[][]={{-1,-5,3},{1,5,-3}};
    int a4[][]={{-200,100,300},{100,30,25},{-20,-20,-20}};
    int a5[][]={{100,500,700},{200,600,800}};
    int a6[][]={{-100,100,50},{100,-50,-25},{0,-50,-25}};
    @Test
    public void check_sum_equals_zero()
{
    YoungPhysicst y= new YoungPhysicst();
    assertEquals(true,y.correct_sum(3,a1));
    assertEquals(false,y.correct_sum(3,a2));
    assertEquals(true,y.correct_sum(2,a3));
    assertEquals(false,y.correct_sum(3,a4));
    assertEquals(false,y.correct_sum(3,a5));
    assertEquals(true,y.correct_sum(3,a6));
}
}