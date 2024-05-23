package com.elitech.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data

public class BaseDTO {
private long id;
private LocalDateTime createdAt;
private LocalDateTime updatedAt;
}
