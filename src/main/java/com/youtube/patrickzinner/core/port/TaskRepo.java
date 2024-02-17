package com.youtube.patrickzinner.core.port;

import com.youtube.patrickzinner.core.model.Task;

public interface TaskRepo {
    Task saveTask(Task task);
}
