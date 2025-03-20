package com.springboothw.todo_app.service;

import com.springboothw.todo_app.dto.TaskHistoryResponseDto;
import com.springboothw.todo_app.entity.TaskHistory;
import com.springboothw.todo_app.repository.TaskHistoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskHistoryService {

    private final TaskHistoryRepository taskHistoryRepository;

    public TaskHistoryService(TaskHistoryRepository taskHistoryRepository) {
        this.taskHistoryRepository = taskHistoryRepository;
    }

    @Transactional(readOnly = true)
    public List<TaskHistoryResponseDto> getHistoryByTodoId(Long todoId) {
        List<TaskHistory> historyList = taskHistoryRepository.findByTodoId(todoId);
        return historyList.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private TaskHistoryResponseDto convertToDto(TaskHistory history) {
        return new TaskHistoryResponseDto(
                history.getId(),
                history.getTodo().getId(),
                history.getOldState(),
                history.getNewState(),
                history.getChangeDate(),
                history.getChangedBy()
        );
    }
}