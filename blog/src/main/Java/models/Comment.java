package main.Java.models;


import java.sql.Timestamp;

public class Comment {
    private int commentId;
    private int articleId;
    private int userId;
    private String content;
    private Timestamp createdAt;

    // 默認構造函數
    public Comment() {
    }

    // 帶參數的構造函數
    public Comment(int commentId, int articleId, int userId, String content, Timestamp createdAt) {
        this.commentId = commentId;
        this.articleId = articleId;
        this.userId = userId;
        this.content = content;
        this.createdAt = createdAt;
    }

    // Getter 和 Setter 方法
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    // toString 方法
    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", articleId=" + articleId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
