/**
 * Copyright (c) 2023, Samsung Electronics Co., Ltd. All rights reserved.
 *
 * Use of this source code is governed by a MIT license that can be
 * found in the LICENSE file.
 */

package com.lpvs.repository;

import com.lpvs.entity.LPVSLicense;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LPVSLicenseRepository extends CrudRepository<LPVSLicense, Long> {

    @Query(value = "SELECT * FROM lpvs.licenses", nativeQuery = true)
    List<LPVSLicense> takeAllLicenses();

    @Query("SELECT m FROM LPVSLicense m WHERE m.spdxId = :spdxId LIMIT 1")
    LPVSLicense searchBySpdxId(@Param("spdxId") String spdxId);

    @Query("SELECT m FROM LPVSLicense m WHERE m.alternativeNames LIKE %:licenseName% LIMIT 1")
    LPVSLicense searchByAlternativeLicenseNames(@Param("licenseName") String licenseName);
}
