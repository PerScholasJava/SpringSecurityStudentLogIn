package org.perscholas.glab.studentlogin.dto;


/*
A Data transfer object - DTO is an object that carries data between processes.
Developers use this type of communication between processes due to the high cost of remote interfacing with clients,
each call to a client is an expensive operation.
DTO’s can reduce the number of method calls to the application.
This can be done by mapping the data from an entity model to the DTO.
This is normally implemented by using a mapper component.
DTO’s can filter the amount of data exposed and transferred.
 */
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;


/*
the Student object was mapped to a studentDto object.
The studentDto object splits the student’s full name into two separate strings: firstname and lastname.
It then checks and validates if a field is empty.
If empty, the dto returns an error message.
So, dto’s can be used to validate the incoming student data from a request
and can filter the type of student data transferred within the application and in a response.
 */
public class StudentDto {
    private Long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

