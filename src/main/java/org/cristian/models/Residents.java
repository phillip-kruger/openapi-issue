package org.cristian.models;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Residents extends BaseModel {

    private String foo;
    private String bar;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
