public class Music {
    String musicTitle;
    String artistName;
    int launchYear;
    double ratingSum;
    double ratingNumber;

//    public Music(String musicTitle, String artistName, int launchYear, double ratingSum) {
//        this.musicTitle = musicTitle;
//        this.artistName = artistName;
//        this.launchYear = launchYear;
//        this.ratingSum = ratingSum;
//    }

    void showMusicDetails() {
        System.out.println("Music title: " + musicTitle);
        System.out.println("Artist name: " + artistName);
        System.out.println("Launch year: " + launchYear);
    }

    void giveRating(double ratingValue) {
        ratingSum += ratingValue;
        ratingNumber++;
    }

    double getRatingAverage() {
        return ratingSum / ratingNumber;
    }
}
