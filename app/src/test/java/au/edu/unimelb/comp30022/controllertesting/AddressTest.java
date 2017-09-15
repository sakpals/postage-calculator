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

public class AddressTest {

    @Mock
    Address address;

    public String numberMock = "234";
    public String streetMock = "Flinders St";
    public String suburbMock = "Parkville";
    public String postcodeMock = "3001";
    public String stateMock = "Victoria";

    @Before
    public void setup() throws Exception {
        address = new Address(numberMock, streetMock, suburbMock, postcodeMock, stateMock);

    }

    @Test
    public void testMethods() {
        assertEquals(address.getNumber(), numberMock);
        assertEquals(address.getPostCode(), postcodeMock);
        assertEquals(address.getState(), stateMock);
        assertEquals(address.getStreet(), streetMock);
        assertEquals(address.getSuburb(), suburbMock);
    }

}
