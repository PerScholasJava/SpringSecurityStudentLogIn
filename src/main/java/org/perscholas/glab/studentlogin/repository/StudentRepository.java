package org.perscholas.glab.studentlogin.repository;

import org.perscholas.glab.studentlogin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/*
JpaRepository is a JPA (Java Persistence API) specific extension of Repository.
It includes the full  API of CrudRepository and PagingAndSortingRepository.
It contains basic CRUD operations, pagination and sorting.

 T: Domain type that repository manages (Generally the Entity/Model
          class name).
 ID: Type of the id of the entity that repository manages - Generally the
       wrapper class of your @Id that is created inside the Entity/Model class.

 */
public interface StudentRepository extends JpaRepository<Student, Long>
{

    Student findByEmail(String email);
}

