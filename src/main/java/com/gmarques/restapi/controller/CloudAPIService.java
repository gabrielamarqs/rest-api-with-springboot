package com.gmarques.restapi.controller;

import com.gmarques.restapi.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    CloudVendor cloundVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendor(String vendorId) {
        return cloundVendor;
//                new CloudVendor("C1", "AWS", "Seattle, WA", "1-800-555-1212");
    }

    @PostMapping
    public String createCloudVendorDetails (@RequestBody CloudVendor cloudVendor) {
        this.cloundVendor = cloudVendor;
        return "Cloud Vendor Details Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails (@RequestBody CloudVendor cloudVendor) {
        this.cloundVendor = cloudVendor;
        return "Cloud Vendor Details Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails (String vendorId) {
        this.cloundVendor = null;
        return "Cloud Vendor Details Deleted Successfully";
    }
}
