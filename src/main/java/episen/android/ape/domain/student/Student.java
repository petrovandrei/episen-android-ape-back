package episen.android.ape.domain.student;
public class Student {


    String id;

    String firstName;
    String lastName;
    String emailAddress;
    String gender;
    String age;
    String group;
    Boolean isRepeating;

    public Student(String id, String firstName, String lastName, String emailAddress, String gender, String age, String group, Boolean isRepeating) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.age = age;
        this.group = group;
        this.isRepeating = isRepeating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean getRepeating() {
        return isRepeating;
    }

    public void setRepeating(Boolean repeating) {
        isRepeating = repeating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        if (emailAddress != null ? !emailAddress.equals(student.emailAddress) : student.emailAddress != null)
            return false;
        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        if (age != null ? !age.equals(student.age) : student.age != null) return false;
        if (group != null ? !group.equals(student.group) : student.group != null) return false;
        return isRepeating != null ? isRepeating.equals(student.isRepeating) : student.isRepeating == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (isRepeating != null ? isRepeating.hashCode() : 0);
        return result;
    }
}
