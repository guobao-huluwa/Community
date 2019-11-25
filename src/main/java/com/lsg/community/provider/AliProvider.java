package com.lsg.community.provider;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;
import com.lsg.community.exception.CustomizeErrorCode;
import com.lsg.community.exception.CustomizeException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.UUID;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-25  11:40
 */

@Service
public class AliProvider {
    @Value("${ali.oss.accessKeyId}")
    private String accessKeyId;
    @Value("${ali.oss.accessKeySecret}")
    private String accessKeySecret;
    @Value("${ali.oss.bucketName}")
    private String bucketName;
    @Value("${ali.oss.endpoint}")
    private String endpoint;


    public String upload(InputStream fileStream, String fileName) {

        String objectName;
        String[] filePaths = fileName.split("\\.");
        if (filePaths.length > 1) {
            objectName = UUID.randomUUID().toString() + "." + filePaths[filePaths.length - 1];
        } else {
            throw new CustomizeException(CustomizeErrorCode.FILE_UPLOAD_FAIL);
        }
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
        PutObjectResult putObjectResult = ossClient.putObject(bucketName, objectName, fileStream);
        if (putObjectResult != null) {
            // 设置URL过期时间为1小时。
            Date expiration = new Date(System.currentTimeMillis() + 3600 * 1000 * 24 * 365 * 10);
            // 生成以GET方法访问的签名URL，访客可以直接通过浏览器访问相关内容。
            URL url = ossClient.generatePresignedUrl(bucketName, objectName, expiration);
            return String.valueOf(url);
        }

        // 关闭OSSClient。
        ossClient.shutdown();

        return objectName;
    }
}
