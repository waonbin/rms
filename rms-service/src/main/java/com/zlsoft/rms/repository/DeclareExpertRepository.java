package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.DeclareExpert;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeclareExpertRepository extends JpaRepository<DeclareExpert, Long>,
        JpaSpecificationExecutor<DeclareExpert>,
        BaseRepository<DeclareExpert, Long> {
}
