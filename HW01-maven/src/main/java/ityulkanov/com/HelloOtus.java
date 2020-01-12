package ityulkanov.com;

import com.google.common.base.MoreObjects;

public class HelloOtus {
    private long id;
    private String name;

    public HelloOtus(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
