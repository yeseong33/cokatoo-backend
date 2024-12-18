package com.cockatoo.domain.user.dto;

import com.cockatoo.domain.user.entity.User;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateUserResponse {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime withdrawAt;

    @Builder
    public CreateUserResponse(Long userId, String name, String email, String password, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime withdrawAt) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.withdrawAt = withdrawAt;
    }
}