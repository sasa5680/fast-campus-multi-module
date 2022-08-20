package dev.backend.module_api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.backend.module_common.enums.CodeEnum;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {

    // 클라 - 서버 통신 시 이걸로 통신한다.

    private String returnCode;
    private String returnMessage;
    private T info;

    public CommonResponse(CodeEnum codeEnum){
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
    }

    public CommonResponse(T info){
        setReturnCode(CodeEnum.SUCCESS.getCode());
        setReturnMessage(CodeEnum.SUCCESS.getMessage());
        setInfo(info);
    }
}
