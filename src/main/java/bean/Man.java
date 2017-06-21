package bean;

public class Man {
    private String name;
    private String addres;
    private int mobile;
    private int age;

    public Man(String name, String addres, int mobile, int age) {
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

        Man man = (Man) o;

        if (mobile != man.mobile) return false;
        if (age != man.age) return false;
        if (!name.equals(man.name)) return false;
        return addres.equals(man.addres);
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
        return "Man{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", mobile=" + mobile +
                ", age=" + age +
                '}';
    }
}