package com.devsuperior.dslearnbds.entities;


import lombok.Data;

@Data
public class Content extends Lesson {

    private String textContent;
    private String videoUri;
}