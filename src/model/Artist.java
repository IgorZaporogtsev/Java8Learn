package model;

import java.util.*;

public class Artist {

    private String name;
    private List<Artist> members;
    private String origin;

    public Artist(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public boolean isFrom(String origin) {
        return this.origin.equals(origin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artist> getMembers() {
        return members;
    }

    public void setMembers(List<Artist> members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }



    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", origin='" + origin + '\'' +
                '}';
    }


}
