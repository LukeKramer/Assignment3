package com.Assignment3.BuildShapes;

import com.Assignment3.Interface.InterfaceShape;
import com.Assignment3.ShapeDomain.ShapeData;


/**
 * Created by student on 2016/03/12.
 */
public class OctogonBuild implements InterfaceShape {

    public ShapeData getShapeData() {

        ShapeData shape = new ShapeData("Octogon",8,"Purpil");
        return shape;
    }
}
