package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.phase.PhaseDefinition;

import java.util.List;

public class AnnotatedPhaseDefinitionLoader extends BasePhaseDefinitionLoader {

    @Override
    public List<PhaseDefinition> reloadAll() {
        return doReloadAll();
    }

    @Override
    public PhaseDefinition reload(String name) {
        return doReload(name);
    }

    protected List<PhaseDefinition> doReloadAll() {
        return null;
    }

    protected PhaseDefinition doReload(String name) {

        PhaseDefinition phaseDefinition = new PhaseDefinition();
        phaseDefinition.setName(name);

        return phaseDefinition;
    }
}
