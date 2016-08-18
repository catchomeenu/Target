package com.target.oprations.retail.helper.impl;

import com.target.oprations.retail.helper.HelloHelper;
import org.springframework.stereotype.Component;


/**
 * Created by msutar on 8/13/16.
 */
@Component
public class HelloHelperImpl implements HelloHelper{


    public String display() {
        return "Hello Target!!!";
    }
}
