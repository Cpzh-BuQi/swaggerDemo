package com.luther.demo.api;

import com.luther.demo.dto.DemoDto;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Author: lvpeng
 * CreateTime: 2018/12/11 16:27
 * ProjectName: demo
 * PackageName: com.luther.demo.api
 * TODO:
 */
@RestController
@RequestMapping("demo")
@Api(value = "示例API", tags = {"用于测试"})
public class Demo {

    @ApiOperation(value = "Get方法示例", notes = "示例Demo")
    @ApiImplicitParam(value = "查询条件", dataType = "String", name = "param", required = true, paramType = "query")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功了"),
            @ApiResponse(code = 400, message = "失败了")
    })
    @GetMapping("/get")
    public ResponseEntity<String> getDemo(@RequestParam("param") String param) {
        return ResponseEntity.ok(param);
    }

    @PostMapping("/post")
    @ApiOperation(value = "Post示例", notes = "示例Demo")
    public ResponseEntity<Void> postDemo(@RequestBody DemoDto demoDto) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/put")
    @ApiOperation(value = "Put示例", notes = "示例")
    public ResponseEntity<Void> putDemo(@RequestBody DemoDto demoDto) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "Delete示例", notes = "示例")
    public ResponseEntity<Void> deleteDemo(@RequestParam("param") String param) {
        return ResponseEntity.ok(null);
    }
}
