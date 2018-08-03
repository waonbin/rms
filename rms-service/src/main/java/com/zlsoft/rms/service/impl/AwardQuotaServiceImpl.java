package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.AwardQuota;
import com.zlsoft.rms.service.AwardQuotaService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("awardQuotaService")
public class AwardQuotaServiceImpl extends BaseSimpleService<AwardQuota, Long> implements AwardQuotaService {
}
