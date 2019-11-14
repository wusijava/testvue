package com.zanclick.testvue;

import com.zanclick.testvue.utils.POIUtil;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class Excelcontroller {
    @RequestMapping("read")
    public String read(HttpServletRequest HttpRequest, Model Model) throws IOException {

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) HttpRequest;
        MultipartFile files = multipartRequest.getFile("files");
        List<String[]> list=  POIUtil.readExcel(files);
        Model.addAllAttributes(list);
        return "list.html";
    }

}
