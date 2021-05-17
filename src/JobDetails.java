public class JobDetails {
    private String title;
    private String company;
    private String location;
    private String type;
    private String level;
    private String yearsExp;
    private String country;
    private String skills;

    public JobDetails(String title, String company, String location, String type, String level, String yearsExp, String country, String skills) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.type = type;
        this.level = level;
        this.yearsExp = yearsExp;
        this.country = country;
        this.skills = skills;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSkills() {
        return skills;
    }

    public String getCountry() {
        return country;
    }

    public String getYearsExp() {
        return yearsExp;
    }

    public String getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + '\t' +
                company + '\t' +
                location + '\t' +
                type + '\t' +
                level + '\t' +
                yearsExp + '\t' +
                country + '\t' +
                skills + '\t';
    }
}
