package com.jessienwei.web.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jessienwei.web.dto.AreaDTO;

@Repository
public interface AreaRepository extends JpaRepository<AreaDTO, Long>{

}
