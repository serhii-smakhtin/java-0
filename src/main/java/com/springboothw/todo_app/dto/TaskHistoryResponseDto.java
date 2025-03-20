package com.springboothw.todo_app.dto;

import java.time.LocalDateTime;

public class TaskHistoryResponseDto {

    private Long id;
    private Long todoId;
    private String oldState;
    private String newState;
    private LocalDateTime changeDate;
    private String changedBy;

    public TaskHistoryResponseDto(Long id, Long todoId, String oldState, String newState, LocalDateTime changeDate, String changedBy) {
        this.id = id;
        this.todoId = todoId;
        this.oldState = oldState;
        this.newState = newState;
        this.changeDate = changeDate;
        this.changedBy = changedBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTodoId() {
        return todoId;
    }

    public void setTodoId(Long todoId) {
        this.todoId = todoId;
    }

    public String getOldState() {
        return oldState;
    }

    public void setOldState(String oldState) {
        this.oldState = oldState;
    }

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }
}