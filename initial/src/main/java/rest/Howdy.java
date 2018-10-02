package rest;

public class Howdy {	

    private final long id;
    private final String content;

    public Howdy(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
