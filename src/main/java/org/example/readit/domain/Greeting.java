package org.example.readit.domain;

/**
 * Author    Rick Qiu
 * Email     qiudejun@gmail.com
 * Date      12/11/14
 * Time      9:30 AM
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
