package models;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album();
        Album album2 = new Album(1, "Michael Jackson", "Bad", 1982, 40.2, "Pop");
        album1.setArtist("Kanye West");
        album1.setName("Graduation");
        album1.setGenre("Hip-Pop, Rap");
        Album album3 = new Album(1, "Kanye West", "College Dropout", 2003, 35.1, "Hip-Pop, Rap");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        Quote quote1 = new Quote();
        Author author1 = new Author(1, "John Lennon");
                quote1.setAuthor(author1);
                quote1.setContent("Life is what happens when you're busy making other plans.");

        System.out.println("\"" + quote1.getContent() + "\"" + " By: " + quote1.getAuthor().getName());

        for (Album album : albums) {
            System.out.println(album.getName());
        }





    }
}
