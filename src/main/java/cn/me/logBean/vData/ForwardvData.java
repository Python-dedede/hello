package cn.me.logBean.vData;

/**
 * @Classname ForwardvData
 * @Description 按钮点击事件·转发的vData bean
 * @Date 2019/9/11 14:44
 * @Created by yuhousheng
 */
public class ForwardvData implements AppSpreadLogvData {
    private String type; //事件类型	forward
    private String url; //转发文章的Url
    private String destType; //转发到哪里 weixin

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDestType() {
        return destType;
    }

    public void setDestType(String destType) {
        this.destType = destType;
    }
}
