package bean;

public class Woman {
    private String name;
    private String addres;
    private int mobile;
    private int age;

    public Woman(String name, String addres, int mobile, int age) {
        this.name = name;
        this.addres = addres;
        this.mobile = mobile;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Woman woman = (Woman) o;

        if (mobile != woman.mobile) return false;
        if (age != woman.age) return false;
        if (!name.equals(woman.name)) return false;
        return addres.equals(woman.addres);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + addres.hashCode();
        result = 31 * result + mobile;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", mobile=" + mobile +
                ", age=" + age +
                '}';
    }
}