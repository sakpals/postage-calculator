package au.edu.unimelb.comp30022.controllertesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;

import android.location.Location;
import static org.mockito.Matchers.any;


import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

/**
 * Created by sampadasakpal on 4/9/17.
 */

public class AusParcelPostTest {

    // create mock objects
    public Location srcMock = Mockito.mock(Location.class);
    public Location destMock = Mockito.mock(Location.class);
    public AusParcelPost ausParcelPost = new AusParcelPost();

    @Before
    public void setup() {

        Mockito.when(srcMock.distanceTo(destMock)).thenReturn((float)1200.0);

    }

    @Test
    public void computeCostTest() {
       assertEquals(ausParcelPost.computeCost(srcMock, destMock), 10);
    }
}
