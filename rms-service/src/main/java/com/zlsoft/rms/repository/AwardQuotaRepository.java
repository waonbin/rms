package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.AwardQuota;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AwardQuotaRepository extends JpaRepository<AwardQuota, Long>,
        JpaSpecificationExecutor<AwardQuota>,
        BaseRepository<AwardQuota, Long> {
}
