package com.journaldev.jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images {
    List<ImageFile> files = new ArrayList<ImageFile>();

    public List<ImageFile> getFiles() {
        return files;
    }


}
