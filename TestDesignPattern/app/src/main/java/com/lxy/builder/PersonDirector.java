package com.lxy.builder;

/**
 * Created by lxy on 16/6/12.
 */

public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
