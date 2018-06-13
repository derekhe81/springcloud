package com.derekhe.cloudexample.organisationservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.derekhe.cloudexample.organisationservice.model.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String>  {
    public Organization findById(String organizationId);
}
