package org.ogcv.model;

import javax.swing.*;

public class Test {

    private static Test instance;


    public Test() {
    }

    public static Test getInstance() {
        if (instance == null) {
            instance = new Test();

        }
        return instance;
    }


}
