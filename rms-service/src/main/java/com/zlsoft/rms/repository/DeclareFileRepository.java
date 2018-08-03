package com.zlsoft.rms.repository;

import com.zlsoft.rms.domain.DeclareFile;
import com.zlsoft.core.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeclareFileRepository extends JpaRepository<DeclareFile, Long>,
        JpaSpecificationExecutor<DeclareFile>,
        BaseRepository<DeclareFile, Long> {
}
