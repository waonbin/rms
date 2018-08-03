package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.Declare;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeclareRepository extends JpaRepository<Declare, Long>,
        JpaSpecificationExecutor<Declare>,
        BaseRepository<Declare, Long> {
}
