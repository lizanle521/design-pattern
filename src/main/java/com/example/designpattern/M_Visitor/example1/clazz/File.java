package com.example.designpattern.M_Visitor.example1.clazz;

public class File extends Entry {
    private String name;
    private int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
