package com.example.tnp.Activities;

public class Member {

    private String Name;
    private float per10;
    private float per12;
    private float perER;

    public Member() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Float getPer10() {
        return per10;
    }

    public void setPer10(Float per10) {
        this.per10 = per10;
    }

    public Float getPer12() {
        return per12;
    }

    public void setPer12(Float per12) {
        this.per12 = per12;
    }

    public Float getPerER() {
        return perER;
    }

    public void setPerER(Float perER) {
        this.perER = perER;
    }

}
