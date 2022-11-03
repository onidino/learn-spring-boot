package com.in28minutes.springboot.learnspringboot;

public class Course {

  private final Long id;
  private final String name;
  private final String author;

  public Course(Long id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return "Course{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", author='" + author + '\'' +
        '}';
  }
}
