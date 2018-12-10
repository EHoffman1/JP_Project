/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: EmployeeInfo.java
 * Date: 12/06/2018
 * DESC:  EmployeeInfo that will allow the user to input their full name
 * and then create a user id of their first initial and surname.
 *************************************************************************************************/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  // The class will have 2 fields
  private StringBuilder name;
  private String code;
  private String deptId;

  // Use UTF-8 as an input stream reader, found through stack overflow
  private Scanner in = new Scanner(System.in, "UTF-8");
  Pattern pattern = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");

  // The setName() method will be called from the constructor.
  /**
   * Constructor for EmployeeInfo.
   */
  public EmployeeInfo() {
    setName();
    setDeptId();
  }

  /**
   * Method that gets name of the employee.
   *
   * @return name of the employee
   */
  public StringBuilder getName() {
    return this.name;
  }

  /**
   * Method that gets the code of the employee.
   *
   * @return code of the employee
   */
  public String getCode() {
    return this.code;
  }

  // will use inputName() to get a name
  // (first name and surname) as a single input from the user
  /**
   * Method that sets the employee name based on user input.
   */
  private void setName() {
    StringBuilder fullName = new StringBuilder(inputName());
    if (checkName(fullName)) {
      this.name = fullName;
      createEmployeeCode(fullName);
    } else {
      this.name = fullName;
      this.code = "guest";
    }
  }

  // createEmployeeCode() is used to take the first initial from the
  // first name and add it to the full surname to create the code.
  // If there is no space then default value of guest is to be used as the value for code.
  /**
   * Method that creates the employee code.
   *
   * @param name employee name used to create employee code
   */
  private void createEmployeeCode(StringBuilder name) {
    this.code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
  }

  /**
   * Method that reads the name from the user input.
   *
   * @return input of user name
   */
  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    String fullName = in.nextLine();
    return fullName;

  }

  // checkName() is used to make sure that the name supplied has a space in it
  /**
   * Method that checks if user input name contains a space.
   *
   * @param name employee name input
   * @return true if contains space, false if it doesn't
   */
  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return name.toString().contains(" ");
    } else {
      return false;
    }
  }

  /**
   * Method that reads the input to get the department ID.
   *
   * @return department ID
   */
  public String getDeptId() {
    System.out.println("Please enter the department ID: ");
    String id = in.nextLine();
    return id;
  }

  /**
   * Method that sets the department ID
   * and checks if valid by calling validId.
   *
   * @return input department ID or "None01" if not valid
   */
  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      this.deptId = id;
    } else {
      this.deptId = "None01";
    }
  }

  /**
   * Method that gets department ID after being tested.
   *
   * @return department ID
   */
  private String getId() {
    return this.deptId;
  }

  /**
   * Method that checks if input ID matches pattern p.
   *
   * @param id department ID that is tested
   * @return boolean if the ID is valid or not
   */
  private boolean validId(String id) {
    Matcher matcher = pattern.matcher(id);
    return matcher.matches();
  }

  // Method from stack overflow
  /**
   * Method that takes the department ID and reverses it.
   *
   * @param id Department ID string that will be reversed
   * @return reverse of the department ID
   */
  public String reverseString(String id) {
    StringBuilder reverse = new StringBuilder(id);
    reverse = reverse.reverse();
    return reverse.toString();
  }

  /**
   * To string method to display employee info.
   *
   * @return Displays employee code and department number
   */
  public String toString() {
    return "Employee Code : " + this.code + "\n"
        + "Department Number : " + this.deptId + "\n";
  }

}
