package main.java.unifr.tandem.domain;

/**
 * UserPref java model with annotations for Jersey marshalling
 * Description: User profile description
 */
public class UserPref extends User{
    private String city;
    private Integer age;
    private String sport;
    private Integer sportLevel;
    private String sex;
    private String frequency;
    private String comments;
    private String profession;
    private String phone;

    public UserPref() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Integer getSportLevel() {
        return sportLevel;
    }

    public void setSportLevel(Integer sportLevel) {
        this.sportLevel = sportLevel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
