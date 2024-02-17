package com.youtube.patrickzinner.core.service;

import com.youtube.patrickzinner.core.model.Task;
import com.youtube.patrickzinner.core.port.TaskRepo;
import com.youtube.patrickzinner.core.port.TaskService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepo taskRepo;

    @Override
    @Transactional
    public Task createTask(Task task) {
        return taskRepo.saveTask(task);
    }
}
