package com.ty;

public class Person {
private int id;
private String name;
private int age;
private String gender;
private long phno;
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phno=" + phno + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}


}
