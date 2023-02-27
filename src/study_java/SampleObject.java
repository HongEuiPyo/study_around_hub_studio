package study_java;

public class SampleObject {

    private String name;
    private String age;
    private String organization;

    public SampleObject() {}

    public SampleObject(String name, String age, String organization) {
        this.name = name;
        this.age = age;
        this.organization = organization;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }
    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }
}
