package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.Expert;
import com.zlsoft.rms.service.ExpertService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("expertService")
public class ExpertServiceImpl extends BaseSimpleService<Expert, Long> implements ExpertService {
}
