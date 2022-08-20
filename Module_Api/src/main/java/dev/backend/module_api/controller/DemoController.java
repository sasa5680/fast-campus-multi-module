package dev.backend.module_api.controller;


import dev.backend.module_api.service.DemoService;
import dev.backend.module_common.repo.MemberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;


    @GetMapping("/save")

    public String save(){



        return demoService.save();

    }
    @GetMapping("/find")
    public String find(){
        return demoService.find();
    }

    @GetMapping("/exception")
    public String exception() {

        return demoService.exception();
    }


}
