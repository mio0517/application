package com.example.application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query(value = "SELECT * FROM sample_db.list where "
            + "sample_db.list.name like CONCAT('%', :searchKey, '%')"
            + "or sample_db.list.genre like CONCAT('%', :searchKey, '%')"
            + "or sample_db.list.address like CONCAT('%', :searchKey, '%')"
            + "or sample_db.list.opening like CONCAT('%', :searchKey, '%')"
            + "or sample_db.list.tel like CONCAT('%', :searchKey, '%')", nativeQuery = true)
    public List<UserEntity> findAllLike(@Param("searchKey") String searchKey);

}