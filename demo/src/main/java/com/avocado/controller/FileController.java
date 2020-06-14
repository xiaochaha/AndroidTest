package com.avocado.controller;


import com.avocado.serviceImpl.FoodServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;


/**
 * @program: demo
 * @description:文件上传
 * @author: ash
 * @create: 2020/06/14 15:18
 */
@RestController
@Api(tags = {"文件上传"})
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FoodServiceImpl foodService;

    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request,@RequestParam int fId) {
        if (file.isEmpty()) {
            System.out.println("文件为空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = System.getProperty("user.dir")+"\\src\\resources\\static\\images\\"; // 上传后的路径
        System.out.println(filePath);
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = fileName;
        System.out.println(filename);
        if (foodService.updateFoodImg(fId,filePath+fileName)!=0){
            model.addAttribute("filename", filename);
            return filename;
        }else{
            return "False";
        }

    }
}



