package com.Assignment3;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Collections;

/**
 * Created by student on 2016/03/11.
 */
public class ListTest {

    @Test
    public void testList() throws Exception {

        AppList list = new AppList();
        int freq = Collections.frequency(list.getList(),"TPG200");
        Assert.assertEquals(2,freq);

    }
}
