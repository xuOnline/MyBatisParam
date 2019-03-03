package com.model;

import java.util.Date;

public class CuxTodoItems {
    private Integer todoItemId;

    private Integer userId;

    private String todoItemTitle;

    private String todoItemContent;

    private String priority;

    private Date creationDate;

    private Date lastUpdateDate;

    private String comments;

    public Integer getTodoItemId() {
        return todoItemId;
    }

    public void setTodoItemId(Integer todoItemId) {
        this.todoItemId = todoItemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTodoItemTitle() {
        return todoItemTitle;
    }

    public void setTodoItemTitle(String todoItemTitle) {
        this.todoItemTitle = todoItemTitle;
    }

    public String getTodoItemContent() {
        return todoItemContent;
    }

    public void setTodoItemContent(String todoItemContent) {
        this.todoItemContent = todoItemContent;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "CuxTodoItems{" +
                "todoItemId=" + todoItemId +
                ", userId=" + userId +
                ", todoItemTitle='" + todoItemTitle + '\'' +
                ", todoItemContent='" + todoItemContent + '\'' +
                ", priority='" + priority + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", comments='" + comments + '\'' +
                '}';
    }
}