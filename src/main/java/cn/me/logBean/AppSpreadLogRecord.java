package cn.me.logBean;

/**
 * @Classname AppSpreadLogRecord
 * @Description app-spread-log record bean
 * @Date 2019/9/11 14:23
 * @Created by yuhousheng
 */
public class AppSpreadLogRecord {
    private String encrypt; //AES,客户端使用的加密方式，支持AES、DES、3DES,TEXT(未使用加密，body中为明文，先使用TEXT方式)
    private String secret; //随机加密密钥加密之后的字串(未使用加密，secret为空串或不传该字段)
    private String version; //szmg-v1,该值用来确定使用的加密密钥
    private AppSpreadLogBody body; // body bean

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AppSpreadLogBody getBody() {
        return body;
    }

    public void setBody(AppSpreadLogBody body) {
        this.body = body;
    }
}
