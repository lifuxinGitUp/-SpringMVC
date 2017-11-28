package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by dllo on 17/11/9.
 */
@Controller
public class HomeController {
    /**
     * 访问localhost:8080/进入的页面
     **/
    @RequestMapping("/")
    public String home() {
        return "fileUpload";
    }

    @RequestMapping("/login")
    public String login(String[] ids, String departId, String postId, Model model) {
        System.out.println(ids);
        for (String id : ids) {
            System.out.println(id);
        }
        System.out.println(departId + " " + postId);
        /**
         * 数据回显
         **/
        model.addAttribute("departId", departId);
        model.addAttribute("postId", postId);
//        return "forward:/hr/findAll"; //转发
        return "redirect:main"; // 重定向
    }

    @RequestMapping("/main")
    public String main() {
        return "error";
    }

    /**
     * 文件上传
     */
    @RequestMapping("/fileUpload")
    public String fileUpload(MultipartFile items_pic,
                             HttpServletRequest request,
                             HttpServletResponse response) throws IOException {
        System.out.println(items_pic);

        String path = request.getServletContext().getRealPath("files");
        File dirFile = new File(path);
        if (!dirFile.exists() || dirFile.isFile()){
            dirFile.mkdir(); // 构建这个目录
        }
        // 构建要存储的文件对象
        File file = new File(dirFile, UUID.randomUUID()+items_pic.getOriginalFilename());
        // 将文件保存到指定目录
        items_pic.transferTo(file);
        System.out.println("文件存储路径"+file.getAbsolutePath());
        return "success";
    }


}
