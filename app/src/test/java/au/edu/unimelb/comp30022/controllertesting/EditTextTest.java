package au.edu.unimelb.comp30022.controllertesting;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import android.location.Location;
import android.widget.*;
import android.widget.EditText;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import static org.mockito.Matchers.any;


import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
/**
 * Created by sampadasakpal on 5/9/17.
 */

public class EditTextTest {

    Editable editable = new SpannableStringBuilder("helloooo");
    EditText ed = Mockito.mock(EditText.class);

    @Before
    public void setup() {
        String msg = "helloooo";
        ed.setText(msg);
        Mockito.when(ed.getText()).thenReturn(editable);
    }


    @Test
    public void testGetText() {
        ed.getText();
        Mockito.verify(ed).getText().equals("helloooo");
    }

}
