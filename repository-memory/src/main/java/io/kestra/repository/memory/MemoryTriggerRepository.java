package io.kestra.repository.memory;

import io.kestra.core.models.executions.Execution;
import io.kestra.core.models.triggers.Trigger;
import io.kestra.core.models.triggers.TriggerContext;
import io.kestra.core.repositories.TriggerRepositoryInterface;

import java.util.*;

import jakarta.inject.Singleton;

@Singleton
@MemoryRepositoryEnabled
public class MemoryTriggerRepository implements TriggerRepositoryInterface {

    private final List<Trigger> triggers = new ArrayList<>();

    @Override
    public Optional<Trigger> findLast(TriggerContext trigger) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Trigger> findByExecution(Execution execution) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Trigger> findAll() {
        return this.triggers;
    }

    @Override
    public Trigger save(Trigger trigger) {
        triggers.add(trigger);

        return trigger;
    }

    @Override
    public void delete(Trigger trigger) {
        triggers.remove(trigger);
    }
}
