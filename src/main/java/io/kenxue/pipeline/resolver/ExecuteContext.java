package io.kenxue.pipeline.resolver;

import lombok.Data;

import java.util.Map;

@Data
public class ExecuteContext {

    private Command command;

    private Map<String,Object> attributes;

    private Object getAttributes(String name){
        return attributes.get(name);
    }

    private void setAttributes(String name,Object value){
        attributes.put(name,value);
    }
}
