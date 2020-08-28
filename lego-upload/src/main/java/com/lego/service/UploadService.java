package com.lego.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: chenjingui
 * @Date: 2020/8/4 16:28
 * @Description:
 */
@Service
public class UploadService {
    private static final Logger logger = LoggerFactory.getLogger(UploadService.class);

    // 支持的文件类型
    private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg");
    @Autowired
    FastFileStorageClient storageClient;

    public String upload(MultipartFile file) {
        try {
            // 1、图片信息校验
            // 1)校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                logger.info("上传失败，文件类型不匹配：{}", type);
                return null;
            }
            // 2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                logger.info("上传失败，文件内容不符合要求");
                return null;
            }
            // 2、将图片上传到FastDFS
            // 2.1、获取文件后缀名
            String originalFilename = file.getOriginalFilename();
            String extension = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
            System.out.println("extension: "+extension);
            // 2.2、上传
            StorePath storePath = this.storageClient.uploadFile(file.getInputStream(), file.getSize(), extension, null);
            // 2.3、返回完整路径
            return "http://image.lego.com/" + storePath.getFullPath();
        } catch (Exception e) {
            return null;
        }
    }
}
