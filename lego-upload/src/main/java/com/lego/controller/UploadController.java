package com.lego.controller;

import com.lego.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther: chenjingui
 * @Date: 2020/8/4 16:29
 * @Description:
 */
@RestController
@RequestMapping("/upload")
public class UploadController {
    @Autowired
    private UploadService uploadService;

    /**
     * 上传图片功能
     *
     * @param file
     * @return
     */
    @PostMapping("/image")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        System.out.println("调用进来了...............");
        String url = this.uploadService.upload(file);
        System.out.println("url: "+url);
      if (StringUtils.isEmpty(url)) {
            // url为空，证明上传失败
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        // 返回200，并且携带url路径
        return ResponseEntity.ok(url);
    }
    @GetMapping("/test")
    public ResponseEntity<String> uploadImage(@RequestParam("name") String name) {
        System.out.println("调用进来了...............");
        if (StringUtils.isEmpty(name)) {
            // url为空，证明上传失败
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        // 返回200，并且携带url路径
        return ResponseEntity.ok(name);
    }
}
