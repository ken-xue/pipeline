package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.phase.PhaseDefinition;

import java.util.List;

public class BasePhaseDefinitionLoader implements PhaseDefinitionLoader {
    
    @Override
    public List<PhaseDefinition> reloadAll() {
        return null;
    }

    @Override
    public PhaseDefinition reload(String name) {
        return null;
    }
    
    protected List<PhaseDefinition> doReloadAll() {
        return null;
    }

    
    protected PhaseDefinition doReload(String name) {
        return null;
    }
}
