package com.youtube.patrickzinner.controller;

import com.youtube.patrickzinner.core.model.Task;
import com.youtube.patrickzinner.core.port.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping(
            path = "tasks",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public TaskDto createTask(@RequestBody TaskDto taskDto) {
        Task task = taskService.createTask(dtoToModel(taskDto));
        return modelToDto(task);
    }

    private Task dtoToModel(TaskDto taskDto) {
        return new Task(taskDto.id(), taskDto.name());
    }

    private TaskDto modelToDto(Task task) {
        return new TaskDto(task.id(), task.name());
    }

}
