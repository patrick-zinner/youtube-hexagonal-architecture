package com.youtube.patrickzinner.bootstrap;

import com.youtube.patrickzinner.core.port.TaskRepo;
import com.youtube.patrickzinner.core.port.TaskService;
import com.youtube.patrickzinner.core.service.TaskServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfiguration {

    @Bean
    public TaskService taskService(TaskRepo taskRepo) {
        return new TaskServiceImpl(taskRepo);
    }
}
