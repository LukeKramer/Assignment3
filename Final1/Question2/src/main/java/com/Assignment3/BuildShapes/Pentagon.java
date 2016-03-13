package com.Assignment3.BuildShapes;


import com.Assignment3.Interface.InterfaceShape;
import com.Assignment3.ShapeDomain.ShapeData;

/**
 * Created by student on 2016/03/12.
 */
public class Pentagon implements InterfaceShape {

    public ShapeData getShapeData() {

        ShapeData shape = new ShapeData("Pentagon",5,"Yellow");
        return shape;
    }
}
