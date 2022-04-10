package io.kenxue.pipeline.loader;

import java.util.List;

public interface DefinitionLoader<T> {
    List<T> reloadAll();
    T reload(String name);
}
