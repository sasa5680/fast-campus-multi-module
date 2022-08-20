package dev.backend.module_api.service;

import dev.backend.module_api.exception.CustomException;
import dev.backend.module_common.enums.CodeEnum;
import dev.backend.module_common.service.CommonDemoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DemoService {

    private final CommonDemoService demoService;

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println((demoService.commonService()));
        return "save";
    }
    public String find() {
        return "find";
    }

    public String exception() {
        if(true) throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        return "exception";
    }

}
