package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.DeclareFile;
import com.zlsoft.rms.service.DeclareFileService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("declareFileService")
public class DeclareFileServiceImpl extends BaseSimpleService<DeclareFile, Long> implements DeclareFileService {
}
