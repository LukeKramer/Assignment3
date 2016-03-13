package com.Assignment3;

import com.Assignment3.Configuration.Config;
import com.Assignment3.Interface.InterfaceShape;
import com.Assignment3.ShapeDomain.ShapeData;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/13.
 */
public class TestRefactoredShapes {

    private InterfaceShape shape;

    @BeforeMethod
    public void testConfig() throws Exception {

        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        shape=(InterfaceShape)ac.getBean("circ");
    }

    @Test
    public void testName() throws Exception {

        ShapeData data = shape.getShapeData();

        Assert.assertEquals(data.getName(),"Circle");

    }

    @Test
    public void testSides() throws Exception {

        ShapeData data = shape.getShapeData();

        Assert.assertEquals(data.getSides(),0);

    }

    @Test
    public void testColour() throws Exception {

        ShapeData data = shape.getShapeData();

        Assert.assertEquals(data.getColour(),"Blue");

    }



}
