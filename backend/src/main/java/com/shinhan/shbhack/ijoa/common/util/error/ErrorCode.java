package com.shinhan.shbhack.ijoa.common.util.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE(400, "C001", "올바르지 않은 입력 입니다!"),
    ENTITY_NOT_FOUND(400, "C003", "해당 엔티티를 찾지 못했습니다!"),
    INTERNAL_SERVER_ERROR(500, "C004", "서버에 접근이 불가능합니다!"),
    INVALID_TYPE_VALUE(400, "C005", "값 형식이 올바르지 않습니다!"),
    HANDLE_ACCESS_DENIED(403, "C006", "접근이 거부되었습니다!"),


    // Member
    EMAIL_DUPLICATION(400, "M001", "이메일이 중복되었습니다!"),
    LOGIN_INPUT_INVALID(400, "M002", "아이디 비밀번호를 확인해 주세요!");

    // Diary


    private final int status;
    private final String code;
    private final String message;


}
