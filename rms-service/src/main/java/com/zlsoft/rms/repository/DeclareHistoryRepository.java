package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.DeclareHistory;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeclareHistoryRepository extends JpaRepository<DeclareHistory, Long>,
        JpaSpecificationExecutor<DeclareHistory>,
        BaseRepository<DeclareHistory, Long> {
}
