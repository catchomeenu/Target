package com.target.oprations.retail.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msutar on 8/16/16.
 */
@Component
public class ExceptionUtil {

    public static List<Error> setSerivceErrors(Exception e) {
        List<Error> errors = new ArrayList();
        Error error = new Error();
        error.setStackTrace(e.getStackTrace());
        errors.add(error);
        return errors;
    }

}
