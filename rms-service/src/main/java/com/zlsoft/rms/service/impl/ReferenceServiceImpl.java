package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.Reference;
import com.zlsoft.rms.service.ReferenceService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("referenceService")
public class ReferenceServiceImpl extends BaseSimpleService<Reference, Long> implements ReferenceService {
}
