package constants;

public enum Sections {
    PULL_REQUESTS ("Pull"),
    ISSUES("Issues"),
    MARKETPLACE("Marketplace"),
    EXPLORE("Explore");

    private final String value;

    Sections(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

