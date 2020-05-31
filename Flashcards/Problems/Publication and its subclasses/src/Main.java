class Publication {
    private String title;
    
    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        System.out.println(publication.getInfo());

        Newspaper newspaper = new Newspaper("Football results", "Sport news");
        System.out.println(newspaper.getInfo());

        Article article = new Article("Why the Sun is hot", "Dr James Smith");
        System.out.println(article.getInfo());

        Announcement announcement = new Announcement("Will sell a house", 30);
        System.out.println(announcement.getInfo());
    }

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        return this.getType() + this.getDetails() + ": " + this.title;
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here
    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return " (source - " + source + ")";
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here
    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return " (author - " + author + ")";
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here
    @Override
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return " (days to expire - " + daysToExpire + ")";
    }
}
