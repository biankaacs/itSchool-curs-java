package org.example.session18.homework;

public class Song {
    /*Create a Song class with title, artist, and length fields.
    Implement the equals() method to check only the title and artist fields.
    Implement the hashCode() method to use the title and artist fields to calculate the hash code.
    Test that two instances with the same title and artist return true for equals() and have the same hash code.*/
    private String title;
    private String artist;
    private int length;
    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return title.equals(song.title) && artist.equals(song.artist);
    }
    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + artist.hashCode();
        return result;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", length=" + length +
                '}';
    }
    public static void main(String[] args) {
        Song song1 = new Song("Imagine", "John Lennon", 183);
        Song song2 = new Song("Imagine", "John Lennon", 183);
        Song song3 = new Song("Bohemian Rhapsody", "Queen", 354);

        System.out.println("song1 equals song2: " + song1.equals(song2));
        System.out.println("song1 equals song3: " + song1.equals(song3));
        System.out.println("song1 hashCode: " + song1.hashCode());
        System.out.println("song2 hashCode: " + song2.hashCode());
        System.out.println("song3 hashCode: " + song3.hashCode());
    }
}
