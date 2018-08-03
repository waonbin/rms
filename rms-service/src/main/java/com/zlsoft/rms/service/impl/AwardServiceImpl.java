package com.zlsoft.rms.service.impl;

import com.zlsoft.rms.domain.Award;
import com.zlsoft.rms.service.AwardService;
import com.zlsoft.core.service.impl.BaseSimpleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("awardService")
public class AwardServiceImpl extends BaseSimpleService<Award, Long> implements AwardService {
}
