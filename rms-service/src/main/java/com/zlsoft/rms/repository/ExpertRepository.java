package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.Expert;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ExpertRepository extends JpaRepository<Expert, Long>,
        JpaSpecificationExecutor<Expert>,
        BaseRepository<Expert, Long> {
}
