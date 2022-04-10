package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.phase.PhaseDefinition;

import java.util.List;

public interface PhaseDefinitionLoader extends DefinitionLoader<PhaseDefinition> {
    @Override
    List<PhaseDefinition> reloadAll();

    @Override
    PhaseDefinition reload(String name);
}
