package com.fc.controller;

import com.fc.util.FileUploadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("fileUpload")
public class FileController {

    @PostMapping("form")
    public String formFileUpload(@RequestPart("face") MultipartFile face,
                                 @RequestPart("photo") MultipartFile[] photo) {
        // 单文件上传
        //&&!face.getOriginalFilename().isEmpty()
        if (face!=null) {
            FileUploadUtil.fileUpload(face);
        }
//
        // 多文件上传
        if (photo != null && photo.length > 0) {
            System.out.println(photo.length+"长度");
            System.out.println(photo);
            for (MultipartFile file : photo) {
                System.out.println("走这了");
               // if(file.getOriginalFilename().isEmpty())continue;
                FileUploadUtil.fileUpload(file);
            }
        }

        return "redirect:/success.html";
    }

    @PostMapping("json")
    @ResponseBody
    public Map<String, Object> jsonFileUpload(@RequestPart("face") MultipartFile face,
                                 @RequestPart("photo") MultipartFile[] photo) {
        Map<String, Object> map = new HashMap<>();

        Set<String> paths = new HashSet<>();

        // 单文件上传
        if (face!=null&&!face.getOriginalFilename().isEmpty()) {

            String path = FileUploadUtil.fileUpload(face);
            paths.add(path);
        }

        // 多文件上传
        if (photo != null && photo.length > 0) {
            for (MultipartFile file : photo) {
                if(file.getOriginalFilename().isEmpty())continue;
                String path = FileUploadUtil.fileUpload(file);
                paths.add(path);
            }
        }

        map.put("code", 200);
        map.put("message", "上传成功");
        map.put("success", true);
        map.put("data", paths);

        return map;
    }
}
