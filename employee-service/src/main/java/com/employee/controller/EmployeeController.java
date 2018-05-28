package com.employee.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/organizations")
public class EmployeeController {

    @RequestMapping(value="test",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getPage(){
        return "Hello World";
    }
}
