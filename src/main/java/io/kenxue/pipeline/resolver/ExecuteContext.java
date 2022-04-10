package io.kenxue.pipeline.resolver;

import java.util.Map;

public class ExecuteContext {

    Command command;

    Map<String,Object> attributes;

    Object getAttributes(String name){
        return attributes.get(name);
    }

    void setAttributes(String name,Object value){
        attributes.put(name,value);
    }
}
