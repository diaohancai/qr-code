package com.hancai.qrcode.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class QRCodeTest {

    @Test
    public void testUrl() {
        String content = "http://www.baidu.com";
        String filePath = "E:\\temp\\qrcode\\baidu_qrcode.jpg";
        QrCodeUtil.generate(content, 300, 300, FileUtil.file(filePath));
    }

    @Test
    public void testString() {
        String content = "diaohancai";
        String filePath = "E:\\temp\\qrcode\\name.jpg";
        QrCodeUtil.generate(content, 300, 300, FileUtil.file(filePath));
    }

}
