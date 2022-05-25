
package com.automation.pojo;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class BackgroundImageScaled {

    public Integer width;
    public Integer height;
    public String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BackgroundImageScaled() {
    }

    /**
     * 
     * @param width
     * @param url
     * @param height
     */
    public BackgroundImageScaled(Integer width, Integer height, String url) {
        super();
        this.width = width;
        this.height = height;
        this.url = url;
    }

}
