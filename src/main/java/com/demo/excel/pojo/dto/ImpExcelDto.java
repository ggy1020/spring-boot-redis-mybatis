package com.demo.excel.pojo.dto;

import lombok.Data;

import java.util.Map;

@Data
public class ImpExcelDto {
    private Long resId;

    private String fileId;

    private Map<String,Object> extParam;
}
