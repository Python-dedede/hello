package cn.me.logBean.vData;

/**
 * @Classname PraisevData
 * @Description TODO
 * @Date 2019/9/11 14:49
 * @Created by yuhousheng
 */
public class PraisevData implements AppSpreadLogvData {
    private String type; //事件类型 praise
    private Byte action; //点赞/取消点赞 action为-1为取消点赞,action为1为点赞
    private String catalogId; //栏目id 12345
    private String articleId; //文章id 123123
    private String userId; //点赞用户ID 121231
    private String nickName; //点赞用户昵称 123412

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
