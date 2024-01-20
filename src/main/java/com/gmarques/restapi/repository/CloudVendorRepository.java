package com.gmarques.restapi.repository;

import com.gmarques.restapi.entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
