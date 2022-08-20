package dev.backend.module_api.exceptionhandler;

import dev.backend.module_api.exception.CustomException;
import dev.backend.module_api.response.CommonResponse;
import dev.backend.module_common.enums.CodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public CommonResponse handlerCustomException(CustomException e) {

        return CommonResponse.builder()
                .returnCode(e.getReturnCode())
                .returnMessage(e.getReturnMessage())
                .build();

    }

    //커스텀으로 래핑하지 못한 에러들 처리
    @ExceptionHandler(Exception.class)
    public CommonResponse handleException(Exception e) {
        return CommonResponse.builder()
                .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
                .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
                .build();
    }

}
