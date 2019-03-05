package com.demo.excel.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
public class ImpExcelDto {
    @ApiModelProperty(value = "资源编码")
    private Long resId;

    @ApiModelProperty(value = "文件id")
    private String fileId;

    @ApiModelProperty(value = "扩展参数")
    private Map<String,Object> extParam;
}
