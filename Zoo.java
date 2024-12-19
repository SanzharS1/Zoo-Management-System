public class Zoo {
    private String name;
    private String location;

    public Zoo(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Zoo: " + name + ", Location: " + location;
    }

    public boolean equals(Zoo other) {
        return this.name.equals(other.name) && this.location.equals(other.location);
    }
}
