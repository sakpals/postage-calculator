package au.edu.unimelb.comp30022.controllertesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import android.location.Location;
import static org.mockito.Matchers.any;


import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

/**
 * Created by william on 31/8/17.
 */
public class ControllerTest {
    
    // create mock objects
    AddressTools addressToolsMock = Mockito.mock(AddressTools.class);
    PostcodeValidator postcodeValidatorMock = Mockito.mock(PostcodeValidator.class);
    PostageRateCalculator postageRateCalculatorMock = Mockito.mock(PostageRateCalculator.class);

    // pass mock objects into constructor
    Controller controller = new Controller(addressToolsMock, postcodeValidatorMock, postageRateCalculatorMock);

    @Before
    public void setUp() throws Exception {
        // Configure mock expected interactions
        Mockito.when(postageRateCalculatorMock.computeCost(any(Location.class), any(Location.class))).thenReturn(5);
        Mockito.when(postcodeValidatorMock.isValid(anyString())).thenReturn(true);
    }

    @Test
    public void testCalculateButtonPressed() {

        //Mockito.verify(postcodeValidatorMock.isValid(anyString()));
        // Call method being tested
        controller.calculateButtonPressed();

        // checks if mock had expected interaction
        Mockito.verify(postageRateCalculatorMock).computeCost(any(Location.class), any(Location.class));
        //assertEquals(postageRateCalculatorMock.computeCost(any(Location.class), any(Location.class)), 5);

        //assert
        assertEquals("$5", controller.costLabel.getText());

    }
    @After
    public void tearDown() throws Exception {

    }

}