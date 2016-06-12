package com.lxy.builder;

/**
 * Created by lxy on 16/6/12.
 */

public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();


    Person buildPerson();
}
