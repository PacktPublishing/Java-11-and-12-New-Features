final class EmpPOJO {
    private String name;
    private int age;

    public EmpPOJO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accessor methods - getName, getAge
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutator methods - setName, setAge
    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj == null || (!(obj instanceof EmpPOJO))) return false;
        else {
            if ((((EmpPOJO) obj).getName().equals(this.name) && (((EmpPOJO) obj).getAge()) == this.age)) {
                return true;
            } else return false;
        }
    }

    public String toString() {
        return name + ":" + age;
    }

    public int hashCode() {
        // ..code
    }
}