package com.dubovskiy.jdbc.entity;



/**
 * consist all bevavior for item in db
 */

public class Item {


    private long id;

    private Topic topic;


    private String htmlTitle;


    private String link;


    private String snippet;


    private Language language;

    private int favourite;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getFavourite() {
        return favourite;
    }

    public void setFavourite(int favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", topic=" + topic +
                ", htmlTitle='" + htmlTitle + '\'' +
                ", link='" + link + '\'' +
                ", snippet='" + snippet + '\'' +
                ", language=" + language +
                ", favourite=" + favourite +
                '}';
    }
}
