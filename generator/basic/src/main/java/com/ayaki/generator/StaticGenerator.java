package com.ayaki.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {
    /**
     *
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

    public static void main(String[] args) {
        String projectpath = System.getProperty("user.dir");//获取根目录,getProperty获取相对路径,获取到的路径为./generator/basic
        //File parentFile = new File(projectpath).getParentFile();//获取父目录./generator
        String inputPath = new File(projectpath,"demo/acm-template").getAbsolutePath();//输入路径：ACM示例代码目录
        String outputPath = projectpath;//输出目录：直接输出到项目的根目录
        copyFilesByHutool(inputPath, outputPath);
    }


}
