package com.example.firstchurchofgodapplication.scripturemodel;

public class BibleResponse {
    private String chapter;

    private String verse;

    private String text;

    private String[] titles;

    private String bookname;

    private String title;

    public String getChapter ()
    {
        return chapter;
    }

    public void setChapter (String chapter)
    {
        this.chapter = chapter;
    }

    public String getVerse ()
    {
        return verse;
    }

    public void setVerse (String verse)
    {
        this.verse = verse;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String[] getTitles ()
    {
        return titles;
    }

    public void setTitles (String[] titles)
    {
        this.titles = titles;
    }

    public String getBookname ()
    {
        return bookname;
    }

    public void setBookname (String bookname)
    {
        this.bookname = bookname;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [chapter = "+chapter+", verse = "+verse+", text = "+text+", titles = "+titles+", bookname = "+bookname+", title = "+title+"]";
    }
}
