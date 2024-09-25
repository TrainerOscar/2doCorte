package org.ogcv.interfaces;

import java.util.ArrayList;
import java.util.Objects;

public interface Operation {



    public void create ();

    void create(Object object);

    public ArrayList<Object> read();

    public void update(Object object);

    public void delete(String cif);

    public Object search(String value);

    public Object search(String name);













}
