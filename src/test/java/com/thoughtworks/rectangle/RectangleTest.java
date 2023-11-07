package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void shouldReturnTheAreaOfRectangleWhenTheLengthAndBreadthAreGiven()
    {
        Rectangle rectangle=new Rectangle(3.14,2.67);
        double area=rectangle.area();
        assertThat(area,is(closeTo(8.38,0.01)));
        
        
    }
    
}
