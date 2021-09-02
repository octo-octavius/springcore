package com.mns.springcore.propertyplaceholder;

class UserDAO {
  private final String serverName;
  private final String username;
  private final String password;

  UserDAO(String serverName, String username, String password) {
    this.serverName = serverName;
    this.username = username;
    this.password = password;
  }

  @Override
  public String toString() {
    return "UserDAO{" +
        "serverName='" + serverName + '\'' +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}