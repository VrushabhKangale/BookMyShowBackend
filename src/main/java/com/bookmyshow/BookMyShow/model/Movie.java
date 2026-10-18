package com.bookmyshow.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {

    private long id;
    private String title;
    private String genre;
    private String language;
    private int durationMinutes;


}
