package be.vdabbeele.Employee.Domain;

public enum Profession {
    HR("HR"), DEVELOPER("Developer");

    private String prettyName;

    Profession(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getPrettyName() {
        return this.prettyName;
    }

}
