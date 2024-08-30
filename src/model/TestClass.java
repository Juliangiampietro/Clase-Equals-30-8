package model;
import interfac.TestInterface;

import java.util.Objects;

public class TestClass {
    private Integer id;
    private String name;

    public TestClass() {
    }

    public TestClass(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof TestClass testClass)) return false;
        return Objects.equals(name, testClass.name);
  }



}
