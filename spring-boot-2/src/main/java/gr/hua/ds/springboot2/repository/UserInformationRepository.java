package gr.hua.ds.springboot2.repository;

import gr.hua.ds.springboot2.entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="user")
public interface UserInformationRepository extends JpaRepository<UserInformation, Integer> {
}
