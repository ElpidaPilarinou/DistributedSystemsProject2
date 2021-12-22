package gr.hua.ds.springboot2.repository;

import gr.hua.ds.springboot2.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="application")
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
