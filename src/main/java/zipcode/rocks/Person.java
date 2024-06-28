package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favoriteColor;
    private String birthMonth;
    private String favoriteBeverage;
    private String havePets;

    public Person(String fname, String lname, String fcolor, String bmonth, String fbeverage, String hpets) {
        this.firstname = fname;
        this.lastname = lname;
        this.favoriteColor = fcolor;
        this.birthMonth = bmonth;
        this.favoriteBeverage = fbeverage;
        this.havePets = hpets;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getFavoriteBeverage() {
        return favoriteBeverage;
    }

    public void setFavoriteBeverage(String favoriteBeverage) {
        this.favoriteBeverage = favoriteBeverage;
    }

    public String getHavePets() {
        return havePets;
    }

    public void setHavePets(String havePets) {
        this.havePets = havePets;
    }

    public String toString() {
        return this.firstname + ", " + this.lastname + ", " + this.birthMonth + ", " + this.favoriteBeverage + ", " + this.favoriteColor + ", " + this.havePets;
    }
}
