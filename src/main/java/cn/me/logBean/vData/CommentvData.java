package cn.me.logBean.vData;

/**
 * @Classname CommentvData
 * @Description 按钮点击事件·评论的vData bean
 * @Date 2019/9/11 14:58
 * @Created by yuhousheng
 */
public class CommentvData implements AppSpreadLogvData {
    private String type; //事件类型  comment
    private Byte action; //评论或删除评论 为1为新增评论 为-1为删除评论
    private String catalogId; //栏目id  12345
    private String articleId; //文章id  123123
    private String content; //评论内容  这是一条测试评论
    private String replayUserName; //回复者昵称 呵呵
    private String beReplayUserName; //被回复者昵称      哈哈
    private String replayUserId; //回复者用户ID     52352
    private String beReplayUserId; //被回复者用户ID    54245

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplayUserName() {
        return replayUserName;
    }

    public void setReplayUserName(String replayUserName) {
        this.replayUserName = replayUserName;
    }

    public String getBeReplayUserName() {
        return beReplayUserName;
    }

    public void setBeReplayUserName(String beReplayUserName) {
        this.beReplayUserName = beReplayUserName;
    }

    public String getReplayUserId() {
        return replayUserId;
    }

    public void setReplayUserId(String replayUserId) {
        this.replayUserId = replayUserId;
    }

    public String getBeReplayUserId() {
        return beReplayUserId;
    }

    public void setBeReplayUserId(String beReplayUserId) {
        this.beReplayUserId = beReplayUserId;
    }
}
