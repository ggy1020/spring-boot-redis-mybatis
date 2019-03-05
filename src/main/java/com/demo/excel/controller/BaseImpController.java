package com.demo.excel.controller;

import com.demo.excel.pojo.dto.ImpExcelDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class BaseImpController {

    @PostMapping("/impExcel")
    @ApiOperation(value = "导入excel")
    public String impExcel(@RequestBody ImpExcelDto impExcelDTO) {

        //扩展参数放到sessionuser 里的otherdata中

        return null;
    }
}
