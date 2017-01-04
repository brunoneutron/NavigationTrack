package com.example.andriesbruno.instructionsshow.osrm_json_request;

/**
 * Created by neutron on 17. 1. 5.
 */

public class Geometry {

    private String type;

    private String[][] coordinates;

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String[][] getCoordinates ()
    {
        return coordinates;
    }

    public void setCoordinates (String[][] coordinates)
    {
        this.coordinates = coordinates;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+", coordinates = "+coordinates+"]";
    }
}
