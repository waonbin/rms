package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.Award;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AwardRepository extends JpaRepository<Award, Long>,
        JpaSpecificationExecutor<Award>,
        BaseRepository<Award, Long> {
}
