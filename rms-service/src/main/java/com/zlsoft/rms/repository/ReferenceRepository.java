package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.Reference;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ReferenceRepository extends JpaRepository<Reference, Long>,
        JpaSpecificationExecutor<Reference>,
        BaseRepository<Reference, Long> {
}
