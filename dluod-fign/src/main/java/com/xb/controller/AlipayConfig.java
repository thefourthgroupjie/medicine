package com.xb.controller;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id ="2016093000631257";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCQc5pHZ+fHu2TwU8XjN8KC23dwDDRbP/+ONuV1MHmJwVGyGq8ngatS9OYfChLE/ShEdPmL2Mf7fAhanW5UZcyPpy6ju6MIex9QQZrL0DVnoQgjiq0Y80uqJq42W3g9YsEAh9UKm3naffWrmGkJciFVruvJSSEP05LuEvpqUXbPSYvSJb52/NCvfI8hWdrtD1bKybdiyTCxsbxKN/6mK5uyA3MXiy5+bE0OQAanykQ5K5W87uAiOUCDRac9bbzvZ7Orkgp/jGdFqUYMvbuLhxgaT75GKBupAWVLDdb8jUndH3U7RTXgpPsJcL03HRVXenvBItJLRzWKaCIsU0+Aa7W1AgMBAAECggEAXTL5G5Eirm9t1NF4H/3d9ef7y8NUFHvaOruYmF/KSuL7/tnQoMC89S0lPGmXapmb3W9Lgrs/bDa+fRiOEs4LibPoF6P8sIAf1/w8D7wqeM4hHi1fOXXgH8wNIu0pSxHoTJtXDRz7JcmXNDuFqZ6Fe278mkYgmsF7TzfXcblV2q8usfPxTpofwiwGFgqmi6GN2hGt2PSj583N62VaY0Xz0u/eOphSPPrcBB92ky1d087jb9FQNsRuVDbPu3y3ZwCraV5RA1EDNmqcWY+88ytuPv50jcuKwvb0I1or87ZHz2tXX8l19bFng3M3BRWPxJJhD+9l30/eyn/D76TBD6bKAQKBgQDwgffNe0bYc3ew3inyzwrPamrOiyv5vjaajZMg7ZgDx+kp+SlsdV7ezqgYNXtk9mJN9Y1DjuH1wzG24C4lgs6LI7SfSXmC6xhTgrptytBeAOye1iFvAj0p0XcVlDpFFuyDFLjmIHNAyqqUUMBaDFDiNM+B8vROEjjel62QZS8eYQKBgQCZwaUw+VEXOw04ubOe2K7pe4uXPRGxtJQdDkKnkUtPf+mBT9eYArmiFFIMaVLpCZrotb8jZGd2YsMaLGZMHET2+FGyAy5jLsU9ZLfHf88ztAiy0muC7ypiyit0C9+szpuF56zZTz/EJRZaJ+P0jeqTpjws7E35sNAsKow3ogfP1QKBgDPI2DFPLNboLcpQW5njSIGWeT7VqndQpHMsrpQ1dDjEL4kRFAE9WFsDBiCIS3RWtJ3ylCMKvc5r4+VraaQ8APrmijqN2HL+6bL5f+ip9al363rbwkEjq0W4yzpDOzSrFeu3Z4RtUkOOH6JlrLT21+eM1W02gbHZrJMI958Smk2hAoGAF0+Ui+hAsxTw3DjLUrnnSt7AOx23IQoPqpgO4vjUQilSbZh9Rz6ihkAucFNHjq02HzHu2J7QUNKIYd95YvCmRAtB14tD7SWaIcSzWDu4Xk5dQz9DrYY1FuUv0Vg7gSeRzKtjOU8ai9JToTeLB/i8J8Z8ORNafxCffxK0T3rxVEECgYBY8AZoXAtRT80Sd/IFZaYcAg7uLkaWrXNWlZHo3MstQPAFUu2U3+6vI4L3k8u7zQgKd5zvuIAsZIsOOZsFoRuRRQXOjTT0HHSwga+TLmTuMfnyao97E0hf1y8IV9UYdtibOMaBir8Cnnt+1RNlkfCfLNfTwrcGPZtbaCc3inrtxw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkHOaR2fnx7tk8FPF4zfCgtt3cAw0Wz//jjbldTB5icFRshqvJ4GrUvTmHwoSxP0oRHT5i9jH+3wIWp1uVGXMj6cuo7ujCHsfUEGay9A1Z6EII4qtGPNLqiauNlt4PWLBAIfVCpt52n31q5hpCXIhVa7ryUkhD9OS7hL6alF2z0mL0iW+dvzQr3yPIVna7Q9Wysm3YskwsbG8Sjf+piubsgNzF4sufmxNDkAGp8pEOSuVvO7gIjlAg0WnPW2872ezq5IKf4xnRalGDL27i4cYGk++RigbqQFlSw3W/I1J3R91O0U14KT7CXC9Nx0VV3p7wSLSS0c1imgiLFNPgGu1tQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://www.xb1y.com/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
