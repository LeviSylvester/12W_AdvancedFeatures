package task2;

public class Person {
    private String familyName;
    private String givenName;
    private String id;
    private String pnc;
    private String homeTown;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPnc() {
        return pnc;
    }

    public void setPnc(String pnc) {
        this.pnc = pnc;
    }

    public Person() {
    }

    public Person(String familyName, String givenName, String homeTown, String id, String pnc) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.homeTown = homeTown;
        this.id = id;
        this.pnc = pnc;
    }

//    @Override
//    public String toString() {
//        return familyName + " " + givenName + " - " + homeTown + " (id: " + id + " pnc: " + pnc + ")";
//    }

    public String getPersonDetails() {
        return familyName + " " + givenName + " - " + homeTown + " (id: " + id + " pnc: " + pnc + ")";
    }
}
