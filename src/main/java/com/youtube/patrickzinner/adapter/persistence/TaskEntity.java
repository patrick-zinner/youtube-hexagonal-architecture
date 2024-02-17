package com.youtube.patrickzinner.adapter.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TaskEntity {
    @Id
    private UUID id = UUID.randomUUID();
    private String name;
}
