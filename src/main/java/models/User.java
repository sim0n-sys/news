package models;

import java.util.Objects;

public class User {
    private int id;
    private String title;
    private String userName;
    private String position;
    private String userRole;
    private int departmentId;

    public User(String title,String userName, String position, String userRole, int departmentId) {
        this.title = title;
        this.userName = userRole;
        this.position = position;
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User users = (User) o;
        return getDepartmentId() == users.getDepartmentId() &&
                getTitle().equals(users.getTitle()) &&
                getUserName().equals(users.getUserName()) &&
                getPosition().equals(users.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getUserName(), getPosition(), getDepartmentId());
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

}