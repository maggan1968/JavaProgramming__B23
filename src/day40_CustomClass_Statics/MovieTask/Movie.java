package day40_CustomClass_Statics.MovieTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
    public String title, country, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts = new ArrayList<>();


}
/*
    Attributes:
			title (String)
			country (String)
			Genre (String)
			releaseDate (LocalDate)
			director (String)
			casts (ArrayList<String>)

		Instance methods
			setInfo(): sets the country, title, Genre ,release date, and director of the Movie
			addCast(String): adds the given string argumnet to the arrayList casts
			addCast(String[]): adds the given string array argumnet to the arrayList casts
			addCast(ArrayLis<String>): adds the given string arraylist argumnet to the arrayList casts
			toString(): returns the name of country, title, release date, and total number of casts
 */