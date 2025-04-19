package com.springDemo.Journal.App;

public class JournalEntry {
    private long id;

    private String title;

    private String content;

    public void setId(long id) {

        this.id = id;
    }
    public long getId() {

        return id;
    }


    public String getTitle() {

        return title;
    }
    public void setTitle(String title) {

        this.title = title;
    }


    public void setContent(String content) {

        this.content = content;
    }
    public String getContent() {

        return content;
    }

}
