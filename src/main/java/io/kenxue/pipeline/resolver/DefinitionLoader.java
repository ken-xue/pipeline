package io.kenxue.pipeline.resolver;

import java.util.List;

public interface DefinitionLoader<T> {
    List<T> reloadAll();
    T reload(String name);
}
