package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.Declare;
import com.zlsoft.rms.service.DeclareService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("declareService")
public class DeclareServiceImpl extends BaseSimpleService<Declare, Long> implements DeclareService {
}
