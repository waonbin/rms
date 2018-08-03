package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.DeclareExpert;
import com.zlsoft.rms.service.DeclareExpertService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("declareExpertService")
public class DeclareExpertServiceImpl extends BaseSimpleService<DeclareExpert, Long> implements DeclareExpertService {
}
