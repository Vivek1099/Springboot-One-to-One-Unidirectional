package com.Springboot_OnetoOne_Uni.Springboot_OnetoOne_Uni;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
