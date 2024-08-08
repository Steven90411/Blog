package main.Java.models;

import java.sql.Timestamp;

public class Article {
    private int articleId;
    private String title;
    private String content;
    private int authorId;
    private Timestamp publishedAt;
    private Timestamp lastEditedAt;

    // 默認構造函數
    public Article() {
    }

    // 帶參數的構造函數
    public Article(int articleId, String title, String content, int authorId, Timestamp publishedAt, Timestamp lastEditedAt) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.publishedAt = publishedAt;
        this.lastEditedAt = lastEditedAt;
    }

    // Getter 和 Setter 方法
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Timestamp getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Timestamp getLastEditedAt() {
        return lastEditedAt;
    }

    public void setLastEditedAt(Timestamp lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    // toString 方法
    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authorId=" + authorId +
                ", publishedAt=" + publishedAt +
                ", lastEditedAt=" + lastEditedAt +
                '}';
    }
}
