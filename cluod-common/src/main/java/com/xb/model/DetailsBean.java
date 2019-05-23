package com.xb.model;

public class DetailsBean {
    private Integer id;

    private String  component;

    private String  shape;

    private String  function;

    private String  reaction;

    private String  taboo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo;
    }

    @Override
    public String toString() {
        return "DetailsBean{" +
                "id=" + id +
                ", component='" + component + '\'' +
                ", shape='" + shape + '\'' +
                ", function='" + function + '\'' +
                ", reaction='" + reaction + '\'' +
                ", taboo='" + taboo + '\'' +
                '}';
    }
}
