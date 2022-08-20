package dev.backend.module_api.service;

import dev.backend.module_api.exception.CustomException;
import dev.backend.module_common.domain.Member;
import dev.backend.module_common.enums.CodeEnum;
import dev.backend.module_common.repo.MemberRepo;
import dev.backend.module_common.service.CommonDemoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DemoService {

    private final CommonDemoService demoService;

    private final MemberRepo memberRepo;

    public String save() {

        memberRepo.save(Member.builder().name(Thread.currentThread().getName()).build());

        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println((demoService.commonService()));
        return "save";
    }
    public String find() {

        System.out.println(memberRepo.findAll().size());
        return "find";
    }

    public String exception() {
        if(true) throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        return "exception";
    }

}
