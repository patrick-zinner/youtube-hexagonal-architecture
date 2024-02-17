package com.youtube.patrickzinner.adapter.persistence;

import com.youtube.patrickzinner.core.model.Task;
import com.youtube.patrickzinner.core.port.TaskRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class TaskDatabaseRepo implements TaskRepo {

    private final TaskJpaRepo jpaRepo;

    @Override
    public Task saveTask(Task task) {
        TaskEntity entity = modelToEntity(task);
        return entityToModel(
                jpaRepo.save(entity)
        );
    }

    private TaskEntity modelToEntity(Task task) {
        return new TaskEntity(
                task.id() == null ? UUID.randomUUID() : task.id(),
                task.name()
        );
    }

    private Task entityToModel(TaskEntity entity) {
        return new Task(
                entity.getId(),
                entity.getName()
        );
    }
}
