package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.DeclareHistory;
import com.zlsoft.rms.service.DeclareHistoryService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("declareHistoryService")
public class DeclareHistoryServcieImpl extends BaseSimpleService<DeclareHistory, Long> implements DeclareHistoryService {
}
