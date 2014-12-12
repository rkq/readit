package org.example.readit.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * Author    Rick Qiu
 * Email     qiudejun@gmail.com
 * Date      12/11/14
 * Time      10:36 AM
 */
public class Summary {
    private final String content = "access greeting please!";

    public String getContent() {

        return content;
    }
}
